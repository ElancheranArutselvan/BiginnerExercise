package Collections;
import java.util.ArrayList;
public class PurchaseCart {
    public static void main(String[] args) {
        Valuable v1 = new Valuable("Fridge","Ecofriendly","fr678",16000);
        Valuable v2 = new Valuable("Television","40 inch LED screen","Tv345",20000);
        Valuable v3 = new Valuable("Ponniyin Selvan","Novel","Ps598",980);
        Valuable v4 = new Valuable("Atta","20Kg","At123",1010);


        ArrayList<Valuable>productList=new ArrayList<>();
       productList.add(v1);
       productList.add(v2);
        System.out.println(productList.size());

        Order a1 = new Order("Ord55","Elaa78",productList);
        a1.priceTotal();
        System.out.println(a1.getCustomerId());

        productList.add(v4);
        a1.addProduct(v3);
        a1.priceTotal();
        System.out.println(productList.size());

        System.out.println(v3.getName());

        ArrayList<Valuable>productListA = new ArrayList<>();
        productListA.add(v2);
        productListA.add(v3);
        Order a2 = new Order("Ord77","Sive81",productListA);
        a2.priceTotal();
        a2.addProduct(v4);
        a2.priceTotal();
        System.out.println(productListA.size());

        a2.removebyId("Tv345");
        System.out.println(a2.getValuableList().size());
        a2.priceTotal();


        ArrayList<Order>orderlist = new ArrayList<>();
        orderlist.add(a1);
        orderlist.add(a2);
        Purchase p1 = new Purchase(orderlist);
        System.out.println(orderlist.size());

        productList.remove(v1);
        System.out.println(productList.size());
    }

}
