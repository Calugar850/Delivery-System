package BLL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface IDeliveryServiceProcessing {
    /**
     * Acesta metoda este utilizata pentru a citi elementele din cadrul fisierului products.csv si a le procesa
     * @post menuItemList!=null
     */
    public void importProduct();

    /**
     * Acesta metoda este utilizata pentru a se efectua o comanda efectuata de catre un client si a se genera factura aferenta comenzii
     * @pre  order.exist!=null
     * @post bill.exist
     */
    public void createOrder();

    /**
     * Se cauta o lista de produse ce au acel nume
     * @param name
     * @pre name !=null
     * @return ArrayList<MenuItem></MenuItem>
     */
    public ArrayList<MenuItem> searchProductsByName(String name);

    /**
     * Se cauta o lista a produselor ce au acelasi pret
     * @param price
     * @pre price !=0
     * @return ArrayList<MenuItem></MenuItem>
     */
    public ArrayList<MenuItem> searchProductByPrice(int price);

    /**
     * Se cauta o lista a produselor ce au aceeasi cantitate de proteine
     * @param proteins
     * @pre proteins !=0
     * @return ArrayList<MenuItem></MenuItem>
     */
    public ArrayList<MenuItem> searchProductByProteins(int proteins);

    /**
     * Se cauta un singur produs dupa nume
     * @param name
     * @return menuItem
     */
    public MenuItem searchProductByName(String name);

    /**
     * Se adauga un produs in menuItemList
     * @param item
     * @pre item!=null
     * @post menuItemList.contains(item)
     */
    public void addProduct(MenuItem item);

    /**
     * Se sterge un produs in menuItemList
     * @param item
     * @pre item!=null
     * @post !menuItemList.contains(item)
     */
    public void deleteProduct(MenuItem item);

    /**
     * Se modifica un produs din menuItemList
     * @param item
     * @param raiting
     * @param cal
     * @param protein
     * @param f
     * @param s
     * @param price
     * @pre item!=null, raiting!=0.0, cal!=0, protein!=0, f!=0, s!=0, price!=0
     * @post item.getRaiting()==raiting, item.getCalories()==cal, item.getProteins()==protein, item.getFats()==f, item.getSodium()==s, item.getPrice()==price
     */
    public void modifyProduct(MenuItem item,double raiting, int cal, int protein, int f, int s, int price);

    /**
     * Se genereaza rezultatele pentru primul raport
     * @param hour1
     * @param hour2
     * @pre hour1>=0, hour2>=0
     * @return List<Order></Order>
     */
    public List<Order> report1(int hour1, int hour2);

    /**
     * Se genereaza rezultatele pentru al doilea raport
     * @param timesOrdered
     * @pre timesOrdered>=0
     * @return List<MenuItem></MenuItem>
     */
    public List<MenuItem> report2(int timesOrdered);

    /**
     * Se genereaza rezultatele pentru al treilea raport
     * @param clientTimesOrdered
     * @param value
     * @pre clientTimesOrdered>=0, value>=0
     * @return List<Order></Order>
     */
    public List<Order> report3(int clientTimesOrdered, int value);

    /**
     * Se genereaza rezultatele pentru al patrulea raport
     * @param dayOfTheMonth
     * @pre dayOfTheMonth>0 && dayOfTheMonth<32
     * @return List<ProductWithCounter></ProductWithCounter></>
     */
    public List<ProductWithCounter> report4(int dayOfTheMonth);
}
