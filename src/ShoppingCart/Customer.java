package ShoppingCart;

import java.util.ArrayList;

public class Customer {
    private String customerId;
    private ArrayList<Order>orders=new ArrayList<>();
    Customer(String customerId){
        this.customerId=customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public void addOrder(Order order){
        orders.add(order);

    }
//    public void getOrders(){
//        orders.get(0);
//
//    }
}
