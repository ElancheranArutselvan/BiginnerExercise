package JavaExercises.BasicAA;
import java.util.Scanner;
public class AreaPrismRect {
    public static void main(String[] args) {
        double l, b, h, Area;
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter length : ");
        l = sides.nextDouble();
        System.out.println("Enter breath : ");
        b = sides.nextDouble();
        System.out.println("Enter Height : ");
        h = sides.nextDouble();
       Area =2*(l*b+b*h+l*h);
        System.out.println("Area of Prism : " +Area);
    }
}
