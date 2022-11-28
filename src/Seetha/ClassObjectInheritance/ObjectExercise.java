package Seetha.ClassObjectInheritance;

public class ObjectExercise {
    private String c = "Boxing ";
    protected int d = 360;
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

}
class ObjectExerciseA{
    private String e = "Have a car ";

    public static void main(String[] args) {

        ObjectExercise objectExercise = new ObjectExercise();
        System.out.println(objectExercise.d);
        System.out.println(objectExercise.getC());
        ObjectExerciseA objectExerciseA = new ObjectExerciseA();
        System.out.println(objectExerciseA.e);

    }
}