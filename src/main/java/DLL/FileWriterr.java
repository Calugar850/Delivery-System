package DLL;

import BLL.BaseProduct;
import BLL.MenuItem;
import BLL.Order;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWriterr {

    public List<BaseProduct> readFromFile() {
        String fileName = "products.csv";
        List<BaseProduct> baseProductList=new ArrayList<>();
        Set<String> stringSet=new HashSet<>();
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
            List<BaseProduct> values = lines
                    .skip(1)
                    .map(line -> Arrays.asList(line.split(",")))
                    .filter(p->stringSet.add(p.get(0)))
                    .map(p-> new BaseProduct(p.get(0),Double.parseDouble(p.get(1)) ,Integer.parseInt(p.get(2)) ,Integer.parseInt(p.get(3)), Integer.parseInt(p.get(4)), Integer.parseInt(p.get(5)), Integer.parseInt(p.get(6)) ))
                    .collect(Collectors.toList());
            baseProductList=values;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baseProductList;
    }

    public void generateBill(Order o){
        FileWriter myWriter;
        int pret=0;
        try {
            myWriter=new FileWriter("order"+o.getOrderID()+".txt");
            myWriter.write("ID-ul facturi este "+o.getOrderID()+" ID-ul clientului este "+o.getClientID()+" \nAcesta a cumparat:");
            for(MenuItem item : o.getMenuItemArrayList()){
                myWriter.write(" "+item.getName()+",");
                pret+=o.getPret();
            }
            myWriter.write("\nSuma totala este "+pret);
            myWriter.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
