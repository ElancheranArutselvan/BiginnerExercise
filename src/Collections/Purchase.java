package Collections;

import java.util.ArrayList;

public class Purchase {

    private ArrayList<Order>orderList;
    Purchase(ArrayList<Order>orderList){
        this.orderList=orderList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }
}
