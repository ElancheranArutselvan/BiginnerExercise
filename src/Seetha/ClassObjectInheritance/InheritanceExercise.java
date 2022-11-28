package Seetha.ClassObjectInheritance;

public class InheritanceExercise {

    private int num = 1000;
    protected String word = "Thousand";
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
public void test1(){
        test();
}
private void test(){
    System.out.println(num+" "+word);
}

}
class Child extends InheritanceExercise{
    private String ply = "Soccer";

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.word);
        System.out.println(child.getNum());
        child.test1();
        System.out.println(child.ply);
    }
}
