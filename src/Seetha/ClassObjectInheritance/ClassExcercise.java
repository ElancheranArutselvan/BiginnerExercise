package Seetha.ClassObjectInheritance;

public class ClassExcercise {
    private String a=" Watching movie";
    private int b = 45;

    public static void main(String[] args) {
        ClassExcercise classExcercise = new ClassExcercise();
        ClassExcercise classExcercise1 = new ClassExcercise();
        System.out.println(classExcercise.a);
        System.out.println(classExcercise.b);
        System.out.println(classExcercise1.a);
        System.out.println(classExcercise.a+" "+classExcercise1.b);

    }
}
