package Seetha.ClassObjectInheritance;

class Children implements InterfaceGrandParent {
    public void name() {
        System.out.println("Arutselvan");
    }
    public void age() {
        System.out.println("age is 60");

    }
}
class Display{
    public static void main(String[] args) {
        Parent parent = new Parent();
        Children children = new Children();
        parent.name();
        parent.age();
        children.name();
        children.age();
        InterfaceGrandParent interfaceGrandParent = new InterfaceGrandParent() {
            public void age() {

            }
        };
        interfaceGrandParent.name();

    }
}
