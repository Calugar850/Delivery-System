package BLL;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Objects;

public class Order implements Serializable {
    private int orderID;
    private LocalDateTime date;
    private int clientID;
    private int pret;
    ArrayList<MenuItem> menuItemArrayList=new ArrayList<>();

    public Order(int orderID, LocalDateTime date, int clientID) {
        this.orderID = orderID;
        this.date = date;
        this.clientID = clientID;
    }

    public Order() {
    }

    public void adaItemToOrder(MenuItem item){
        this.pret+=item.getPrice();
        menuItemArrayList.add(item);
    }

    public int getPret() { return pret; }

    public void setPret(int pret) { this.pret = pret; }

    public ArrayList<MenuItem> getMenuItemArrayList() { return menuItemArrayList; }

    public void setMenuItemArrayList(ArrayList<MenuItem> menuItemArrayList) { this.menuItemArrayList = menuItemArrayList; }

    public int getOrderID() { return orderID; }

    public void setOrderID(int orderID) { this.orderID = orderID; }

    public LocalDateTime getDate() { return date; }

    public void setDate(LocalDateTime date) { this.date = date; }

    public int getClientID() { return clientID; }

    public void setClientID(int clientID) { this.clientID = clientID; }

    @Override
    public String toString() {
        return "Order" + orderID + " date: " + date +  " clientID:" + clientID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderID == order.orderID &&
                clientID == order.clientID &&
                date.equals(order.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderID, date, clientID);
    }
}
