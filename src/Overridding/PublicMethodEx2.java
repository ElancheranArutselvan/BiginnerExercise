package Overridding;

public class PublicMethodEx2 extends Dosa{
    public void eat(){
        System.out.println("Kid with toys");
    }}
class Test{
    public static void main(String[] args) {
        Dosa obj11 = new Dosa();
        Dosa obj12 = new PublicMethodEx2();
        obj11.eat();
        obj12.eat();
    }
}
