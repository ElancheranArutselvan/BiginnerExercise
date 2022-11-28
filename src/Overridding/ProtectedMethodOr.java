package Overridding;

public class ProtectedMethodOr {
    protected void cat(){
        System.out.println("Siberian Tiger");
    }
}
class ProtectedMethodOr1 extends ProtectedMethodOr{
    protected void cat(){
        System.out.println("African Lion");
    }

}
