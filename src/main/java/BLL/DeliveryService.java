package BLL;

import DLL.FileWriterr;
import presentation.Controller;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;


public class DeliveryService extends Observable implements IDeliveryServiceProcessing, Serializable {
    Map<Order, ArrayList<MenuItem>> orderHashSetMap=new HashMap<>();
    List<MenuItem> menuItemList;
    ArrayList<BaseProduct> c=new ArrayList<>();
    Order order;

    public DeliveryService(List<MenuItem> menuItemList) { this.menuItemList = menuItemList; }

    public DeliveryService() { this.menuItemList =new ArrayList<>(); }

    /**
     * Creaza un produs composite pe baza unei liste de produse de baza adaugate din interfata grafica
     * @param title
     * @pre title!=null
     * @post menuItemList.contains(compositeProduct)
     */
    public void creatComp(String title){
        assert title!=null;
        assert isWellFormed();
        double rt=0.0;
        int cl=0;
        int pr=0;
        int fat=0;
        int sodiu=0;
        int pri=0;
        for(BaseProduct b: c){
            rt=b.getRaiting();
            cl+=b.getCalories();
            pr+=b.getProteins();
            fat+=b.getFats();
            sodiu+=b.getSodium();
            pri+=b.getPrice();
        }
        menuItemList.add(new CompositeProduct(title,rt,cl,pr,fat,sodiu,pri,c));
        c.clear();
        assert isWellFormed();
    }

    /**
     * Se adauga produse de baza in lista ce urmeaza sa alcatuiasca composite products
     * @param name
     * @pre name!=null
     * @post 
     */
    public void addBase(String name){
        assert name!=null;
        assert isWellFormed();
        c.add((BaseProduct) searchProductByName(name));
        assert isWellFormed();
    }

    @Override
    public void importProduct() {
        assert isWellFormed();
        assert menuItemList!=null;
        FileWriterr fileWriter=new FileWriterr();
        List<BaseProduct> baseProducts=new ArrayList<>();
        baseProducts=fileWriter.readFromFile();
        menuItemList.clear();
        menuItemList.addAll(baseProducts);
        assert isWellFormed();
    }

    public void createOrder(Order o){
        assert isWellFormed();
        order=o;
        createOrder();
        setChanged();
        notifyObservers(this.order);
        assert isWellFormed();
    }

    @Override
    public void createOrder() {
        assert isWellFormed();
        orderHashSetMap.put(order, (ArrayList<MenuItem>) order.getMenuItemArrayList().clone());
        FileWriterr fileWriter=new FileWriterr();
        fileWriter.generateBill(order);
        assert isWellFormed();
    }

    @Override
    public ArrayList<MenuItem> searchProductsByName(String name) {
        assert name!=null;
        assert isWellFormed();
        ArrayList<MenuItem> menuItemArrayList = menuItemList.stream()
                .filter(p -> p.getName().equals(name))
                .collect(Collectors.toCollection(ArrayList::new));
        assert isWellFormed();
        return menuItemArrayList;
    }

    @Override
    public ArrayList<MenuItem> searchProductByPrice(int price) {
        assert price!=0;
        assert isWellFormed();
        ArrayList<MenuItem> menuItemArrayList = menuItemList.stream()
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toCollection(ArrayList::new));
        assert isWellFormed();
        return menuItemArrayList;
    }

    @Override
    public ArrayList<MenuItem> searchProductByProteins(int proteins) {
        assert proteins!=0;
        assert isWellFormed();
        ArrayList<MenuItem> menuItemArrayList = menuItemList.stream()
                .filter(p -> p.getProteins() == proteins)
                .collect(Collectors.toCollection(ArrayList::new));
        assert isWellFormed();
        return menuItemArrayList;
    }

    @Override
    public MenuItem searchProductByName(String name) {
        assert name!=null;
        assert isWellFormed();
        for(MenuItem item: menuItemList){
            if(item instanceof BaseProduct)
            {
                if(item.getName().equals(name)) {
                    return item;
                }
            }else if(item instanceof CompositeProduct){
                if(item.getName().equals(name)) {
                    return item;
                }
            }
        }
        assert isWellFormed();
        return null;
    }

    @Override
    public void addProduct(MenuItem item) {
        assert isWellFormed();
        menuItemList.add(item);
        assert isWellFormed();
    }

    @Override
    public void deleteProduct(MenuItem item) {
        assert isWellFormed();
        menuItemList.remove(item);
        assert isWellFormed();
    }

    @Override
    public void modifyProduct(MenuItem i,double raiting, int cal, int protein, int f, int s, int price) {
        assert isWellFormed();
        for(MenuItem item: menuItemList) {
            if (item instanceof BaseProduct && item.equals(i)) {
                ((BaseProduct) item).setRaiting(raiting);
                ((BaseProduct) item).setCalories(cal);
                ((BaseProduct) item).setProteins(protein);
                ((BaseProduct) item).setFats(f);
                ((BaseProduct) item).setSodium(s);
                ((BaseProduct) item).setPrice(price);
            } else if (item instanceof CompositeProduct && item.equals(i)) {
                ((CompositeProduct) item).setRaiting(raiting);
                ((CompositeProduct) item).setCalories(cal);
                ((CompositeProduct) item).setProteins(protein);
                ((CompositeProduct) item).setFats(f);
                ((CompositeProduct) item).setSodium(s);
                ((CompositeProduct) item).setPrice(price);
            }
        }
        assert isWellFormed();
    }


    @Override
    public List<Order> report1(int hour1, int hour2) {
        assert isWellFormed();
        List<Order>  orderList= orderHashSetMap.keySet().stream().filter(comanda ->  hour2 > comanda.getDate().getHour()).filter(comanda -> hour1 < comanda.getDate().getHour()).collect(Collectors.toList());;
        assert isWellFormed();
        return orderList;
    }

    @Override
    public List<MenuItem> report2(int timesOrdered) {
        assert isWellFormed();
        ArrayList<MenuItem> items=new ArrayList<>();
        orderHashSetMap.values().stream().forEach(items::addAll);
        assert isWellFormed();
        return items.stream().filter(item-> Collections.frequency(items,item)>timesOrdered).distinct().collect(Collectors.toList());
    }

    @Override
    public List<Order> report3(int clientTimesOrdered, int value) {
        assert isWellFormed();
        int maxClientId= orderHashSetMap.keySet().stream().mapToInt(Order::getClientID).max().getAsInt();
        int[] freqArray= new int[maxClientId+1];
        orderHashSetMap.keySet().forEach(order1 -> freqArray[order1.getClientID()]++);
        assert isWellFormed();
        return orderHashSetMap.keySet().stream().filter(order1 -> freqArray[order1.getClientID()]>=clientTimesOrdered).filter(order1 -> order1.getPret()>value).distinct().collect(Collectors.toList());
    }

    @Override
    public List<ProductWithCounter> report4(int dayOfTheMonth) {
        assert isWellFormed();
        ArrayList<MenuItem> items=new ArrayList<>();
        orderHashSetMap.entrySet().stream().filter(set-> set.getKey().getDate().getDayOfMonth() ==dayOfTheMonth).forEach(set-> items.addAll(set.getValue()));
        ArrayList<ProductWithCounter> list=new ArrayList<>();
        assert isWellFormed();
        return items.stream().distinct().map(p-> new ProductWithCounter(p,Collections.frequency(items,p))).collect(Collectors.toList());
    }

    public List<MenuItem> getMenuItemList() { return menuItemList; }

    public Order getOrder() {
        return order;
    }

    public Map<Order, ArrayList<MenuItem>> getOrderHashSetMap() {
        return orderHashSetMap;
    }

    public boolean isWellFormed(){
        if (orderHashSetMap==null)
            return false;
        for (Order o: orderHashSetMap.keySet()){
            if (o == null)
                return false;
        }
        for (ArrayList<MenuItem> menuItems: orderHashSetMap.values()){
            for (MenuItem item :menuItems){
                if (item==null)
                    return false;
            }
        }
        if (menuItemList==null)
            return false;
        for (MenuItem item :menuItemList){
            if (item==null)
                return false;
        }
        return true;
    }
}
