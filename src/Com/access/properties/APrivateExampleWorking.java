package Com.access.properties;

public class APrivateExampleWorking {
    public static void main(String[] args) {
        APrivate aPrivate=new APrivate();
        System.out.println(aPrivate.getName());
        aPrivate.setName("Seetha");
        System.out.println(aPrivate.getName());
    }
}
