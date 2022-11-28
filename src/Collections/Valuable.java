package Collections;

public class Valuable {
    private String name;
    private String description;
    private String valuableId;
    private int price;
    Valuable(String name,String description, String valuableId, int price){
        this.name=name;
        this.description=description;
        this.valuableId=valuableId;
        this.price=price;
    }
    public String getValuableId() {
        return valuableId;
    }

    public void setValuableId(String valuableId) {
        this.valuableId = valuableId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
