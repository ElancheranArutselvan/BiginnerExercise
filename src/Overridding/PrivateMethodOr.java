package Overridding;

public class PrivateMethodOr {
    private void fruit() {
        System.out.println("Fruits are healthy foods");
    }

    public void fruit1() {
        fruit();
    }
}
class FreshFruit extends PrivateMethodOr {

    public void fruit() {
        System.out.println("Red Apples");
    }

}

class PrivateMethodEx{
    public static void main(String[] args) {
        PrivateMethodOr privateMethodOr = new PrivateMethodOr();
        privateMethodOr.fruit1();
       FreshFruit freshFruit =new FreshFruit();
        freshFruit.fruit();
        PrivateMethodOr privateMethodOr1= new FreshFruit();
        privateMethodOr1.fruit1();
    }
}



