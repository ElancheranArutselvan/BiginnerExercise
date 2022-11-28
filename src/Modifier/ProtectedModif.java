package Modifier;

public class ProtectedModif {
    protected String army = "Navy Ship";
    protected int code = 6789;
    protected String status = "crashed";
}
class Sub extends ProtectedModif {
    protected int crashedYear = 2020;

    public static void main(String[] args) {
        Sub myOb = new Sub();
        System.out.print(myOb.army);
        System.out.print(" " + myOb.code);
        System.out.print(" " + myOb.status);
        System.out.println(" " + myOb.crashedYear);
    }
}