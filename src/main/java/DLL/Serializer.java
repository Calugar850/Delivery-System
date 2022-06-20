package DLL;

import BLL.DeliveryService;

import java.io.*;

public class Serializer {
    private   String path="file.txt";

    public Serializer(String path) {
        this.path = path;
    }

    public Serializer() {
    }

    public void write(Object object){
        FileOutputStream file = null;
        try {
            file = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public DeliveryService read() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(path);
        ObjectInputStream in = new ObjectInputStream(file);
        DeliveryService object =(DeliveryService) in.readObject();
        file.close();
        in.close();
        return  object;
    }

}