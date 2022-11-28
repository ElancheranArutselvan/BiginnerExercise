package Seetha.ClassObjectInheritance;

public class PolymorphismCat {
    public void feature(){
        System.out.println("Around the world ,35 to 40 variety of cats are there");
    }
    private void behaviour1(){
        System.out.println("Have Different behaviour");
    }
    public void behavior(){
        behaviour1();
    }
}
class Lion extends PolymorphismCat{
    public void feature() {
        System.out.println("Lion : King of the Jungle");
    }
    public void behavior() {
        System.out.println("Lions are Social Animal");;
    }
}
class Tiger extends PolymorphismCat{
    @Override
    public void feature() {
        super.feature();
    }

    @Override
    public void behavior() {
        System.out.println("Tigers like loneliness");
    }
}
class Board{
    public static void main(String[] args) {
        PolymorphismCat polymorphismCat = new PolymorphismCat();
        Lion lion=new Lion();
        Tiger tiger = new Tiger();
        polymorphismCat.feature();
        polymorphismCat.behavior();
        lion.feature();
        lion.behavior();
        tiger.behavior();
        tiger.feature();

    }
}
