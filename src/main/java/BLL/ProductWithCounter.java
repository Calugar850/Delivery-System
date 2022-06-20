package BLL;

import java.io.Serializable;

public class ProductWithCounter extends BaseProduct implements Serializable {
    int timesOrdered;


    public ProductWithCounter(String title, double raiting, int calories, int proteins, int fats, int sodium, int price, int timesOrdered) {
        super(title, raiting, calories, proteins, fats, sodium, price);
        this.timesOrdered = timesOrdered;
    }
    public ProductWithCounter (MenuItem menuItem, int timesOrdered){
        super(menuItem.getName(),menuItem.getRaiting(),menuItem.getCalories(),menuItem.getProteins(),menuItem.getFats(),menuItem.getSodium(),menuItem.getPrice());
        this.timesOrdered=timesOrdered;
    }

    @Override
    public String toString() {
        return super.toString() +
                " timesOrdered=" + timesOrdered ;
    }
}
