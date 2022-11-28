package Collections;

import ShoppingCart.Product;

import java.util.ArrayList;

public class Order {
    private String CustomerId;

    Order(String orderId, String customerId, ArrayList<Valuable> valuableList) {
        this.orderId = orderId;
        this.CustomerId = customerId;
        this.valuableList = valuableList;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }
    public String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Valuable> getValuableList() {
        return valuableList;
    }

    public void setValuableList(ArrayList<Valuable> valuableList) {
        this.valuableList = valuableList;
    }

    public ArrayList<Valuable> valuableList;
    public void addProduct(Valuable valuable){
        valuableList.add(valuable);
    }
    public void priceTotal() {
        int sum = 0;
        for (Valuable valuable : valuableList){
            sum=sum+ valuable.getPrice();
        }
        System.out.println("Order Price is Rs : "+sum);
    }
    public void removebyId(String abc){
        ArrayList<Valuable>valuableArrayList = new ArrayList<>();
        for (Valuable valuable : valuableList) {
            if(valuable.getValuableId()!=abc){
                valuableArrayList.add(valuable);
            }
        }valuableList=valuableArrayList;
    }
}
