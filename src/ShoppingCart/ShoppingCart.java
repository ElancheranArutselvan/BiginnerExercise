package ShoppingCart;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        Customer c1 = new Customer("Vishal");
        Product p1 = new Product("aa","TV",10000);
        Product p2 = new Product("bb","Radio",5000);
        Product p3 = new Product("cc","Rice",1000);
        Product p4 = new Product("dd","dates",180);
        ArrayList<Product>emptyList=new ArrayList<>();
Order o1 = new Order("a1", c1.getCustomerId(), emptyList);
emptyList.add(p1);
emptyList.add(p3);
        System.out.println(o1.getProductList().size());
        o1.addProduct(p2);
        o1.addProduct(p4);
        System.out.println(o1.getProductList().size());
        o1.totalPrize();
//
        o1.printProductName();
        o1.removeProduct(p3);
        o1.removebyname("dates");
        System.out.println(o1.getProductList().size());
        System.out.println(o1.getProductList().size());
        o1.printSize();
        o1.totalPrize();
        Customer c2 = new Customer("Veer");
        ArrayList<Product>emptyListA=new ArrayList<>();
        Order o2 = new Order("a2", c2.getCustomerId(), emptyListA);
o2.addProduct(p4);
o2.addProduct(p3);
o2.addProduct(p2);
o2.addProduct(p1);
c2.addOrder(o2);
        System.out.println(emptyListA.size());
o2.printProductName();
o2.totalPrize();
        HashMap<String,Customer>customers = new HashMap<>();
        customers.put("Vishal",c1);
        customers.put("Veer",c2);
        System.out.println(customers.get("Veer"));

    }
}
