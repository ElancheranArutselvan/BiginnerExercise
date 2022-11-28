package inherPolyInner;

public class Polymorphism {
    public void play(){
        System.out.println("Player name : Play name");
    }
}
class Sachin extends Polymorphism{
    public void play(){
        System.out.println("Sachin : Cricket");
    }
}
class Roger extends Polymorphism{
    public void play(){
        System.out.println("Roger : Tennis");
    }
}
class Rock extends Polymorphism{
    public void play(){
        System.out.println("Rock : Wrestle");
    }
}
class Main {
    public static void main(String[] args) {
        Polymorphism myip1 = new Polymorphism();
        Sachin myip2 = new Sachin();
        Roger myip3 = new Roger();
        Rock myip4 = new Rock();
        myip1.play();
        myip2.play();
        myip3.play();
        myip4.play();
    }
}