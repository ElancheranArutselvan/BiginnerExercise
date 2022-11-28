package ShoppingCart;

import java.util.ArrayList;

public class Order {

    private String orderId;
    private String customerId;
    private ArrayList<Product>productList;
    public Order(String orderId,String customerId,ArrayList<Product>productList){
        this.orderId=orderId;
        this.customerId=customerId;
        this.productList = productList;
    } public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
}
public void removebyname(String abc){
    ArrayList<Product>products = new ArrayList<>();
        for (Product product:productList) {
        if(product.getName()!= abc){
        products.add(product);
        }
        }productList=products;
}
public void printProductName(){
    for(Product product: productList){
        System.out.println(product.getName());
    }
}
public void printSize(){
    System.out.println(productList.size());
}
public void totalPrize(){
        double sum=0.00d;
        for (Product product:productList){
            sum =sum+product.getPrice();
        }
    System.out.println(sum);
}
}
