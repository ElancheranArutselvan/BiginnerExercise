package Overridding;

public class PublicMethodOrEx extends PublicMethodOr {

    public void eat() {
        System.out.println("Idiyappam with Paya");
    }

    public static void main(String[] args) {
        PublicMethodOr obj1 = new PublicMethodOrEx();
        Dosa obj2 = new Dosa();
        PublicMethodOrEx obj3 = new PublicMethodOrEx();
        obj1.eat();
        obj2.eat();
        obj3.eat();
    }
}
