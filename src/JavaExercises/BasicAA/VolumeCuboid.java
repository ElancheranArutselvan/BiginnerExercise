package JavaExercises.BasicAA;
import java.util.Scanner;
public class VolumeCuboid {
    public static void main(String[] args) {
        double l, b, h, Vocuboid;
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length : ");
        l = sides.nextDouble();
        System.out.println("Enter breath : ");
        b = sides.nextDouble();
        System.out.println("Enter Height : ");
        h = sides.nextDouble();
        Vocuboid =l*b*h;
        System.out.println("Area of Prism : " +Vocuboid);
    }
}
