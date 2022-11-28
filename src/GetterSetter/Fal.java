package GetterSetter;

public class Fal {
    public static void main(String[] args) {
        Fruit B = new Fruit();
        Fruit C = new Fruit();
        B.setPazham("Apple");
        C.setPazham("Orange");
        System.out.println(B.getPazham());
        System.out.println(C.getPazham());
    }
}
