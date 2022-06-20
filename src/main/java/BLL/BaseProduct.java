package BLL;

import java.io.Serializable;

public class BaseProduct implements MenuItem, Serializable {
    private String title;
    private double raiting;
    private int calories;
    private int proteins;
    private int fats;
    private int sodium;
    private int price;

    public BaseProduct(String title, double raiting, int calories, int proteins, int fats, int sodium, int price) {
        this.title = title;
        this.raiting = raiting;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.sodium = sodium;
        this.price = price;
    }

    @Override
    public int computePrice() {
        return this.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) { this.title = title; }

    public void setName(String name){
        this.title=name;
    }

    @Override
    public String getName() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public double getRaiting() {
        return raiting;
    }

    public void setRaiting(double raiting) {
        this.raiting = raiting;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getSodium() { return sodium; }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  title + " "
                + raiting + " "
                + calories + " "
                + proteins + " "
                + fats + " "
                + sodium +  " "
                + price ;
    }
}
