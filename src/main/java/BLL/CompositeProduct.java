package BLL;

import java.io.Serializable;
import java.util.ArrayList;

public class CompositeProduct implements MenuItem, Serializable {
    private String product;
    private double raiting;
    private int calories;
    private int proteins;
    private int fats;
    private int sodium;
    private int price;
    private ArrayList<BaseProduct> baseProductArrayList;

    public CompositeProduct(String product, double raiting, int calories, int proteins, int fats, int sodium, int price, ArrayList<BaseProduct> baseProductArrayList) {
        this.product = product;
        this.raiting = raiting;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.sodium = sodium;
        this.price = price;
        this.baseProductArrayList = baseProductArrayList;
    }

    public CompositeProduct(String product, ArrayList<BaseProduct> baseProductArrayList) {
        this.product = product;
        this.baseProductArrayList = baseProductArrayList;
    }

    @Override
    public int computePrice() {
        int pret=0;
        for(MenuItem b: baseProductArrayList){
            pret=pret+b.computePrice();
        }
        this.price=pret;
        return this.price;
    }

    public void deleteBaseProduct(BaseProduct b){ baseProductArrayList.remove(b); }

    public String getProduct() { return product; }

    public void setProduct(String product) { this.product = product; }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public ArrayList<BaseProduct> getBaseProductArrayList() { return baseProductArrayList; }

    public void setBaseProductArrayList(ArrayList<BaseProduct> baseProductArrayList) { this.baseProductArrayList = baseProductArrayList; }

    public void setName(String name){
        this.product=name;
    }

    @Override
    public String getName() { return product; }

    public double getRaiting() { return raiting; }

    public void setRaiting(double raiting) { this.raiting = raiting; }

    public int getCalories() { return calories; }

    public void setCalories(int calories) { this.calories = calories; }

    public int getProteins() { return proteins; }

    public void setProteins(int proteins) { this.proteins = proteins; }

    public int getFats() { return fats; }

    public void setFats(int fats) { this.fats = fats; }

    public int getSodium() { return sodium; }

    public void setSodium(int sodium) { this.sodium = sodium; }

    @Override
    public String toString() {
        return  product + " "
                + raiting + " "
                + calories + " "
                + proteins + " "
                + fats + " "
                + sodium + " "
                + price;
    }
}
