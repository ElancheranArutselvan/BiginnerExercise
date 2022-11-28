package Seetha.ClassObjectInheritance;

interface InterfaceGrandParent {
    private void name1() {
        System.out.println(666666);
    }

    default void name(){
        name1();
    };
    public void age();
}
class Parent implements InterfaceGrandParent{
    public void name() {
        System.out.println(" Nakkeeran ");
    }

    @Override
    public void age() {
        System.out.println("95");
    }
}
