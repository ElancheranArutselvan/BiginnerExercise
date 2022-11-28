package ShoppingCart;

public class Product {
    private String productId;
    private String name;
    private int price;

    public Product(String productId,String name,int price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
