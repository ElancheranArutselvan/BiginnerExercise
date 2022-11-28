package Overridding;

public class PublicMethodOrEx1 extends PublicMethodOrEx {
    public void eat() {
        System.out.println("Bread with butter");
    }

    public static void main(String[] args) {
        PublicMethodOr obj1 = new PublicMethodOr();
        Dosa obj2 = new Dosa();
        PublicMethodOrEx obj3 = new PublicMethodOrEx();
        obj1.eat();
        obj2.eat();
        obj3.eat();
        PublicMethodOrEx obj4 = new PublicMethodOrEx1();
        obj4.eat();
//        Dosa obj5 = new PublicMethodOr();
        PublicMethodOr obj6 = new PublicMethodOrEx();
        PublicMethodOr obj7 = new PublicMethodOrEx1();
        obj6.eat();
        obj7.eat();
    }
}
