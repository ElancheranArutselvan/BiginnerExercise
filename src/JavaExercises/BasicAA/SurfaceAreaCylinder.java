package JavaExercises.BasicAA;
import java.util.Scanner;
public class SurfaceAreaCylinder {
    public static void main(String[] args) {
        double r, h, SA;
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sides.nextDouble();
        System.out.println("Enter Height : ");
        h = sides.nextDouble();
        SA =(2*22.0/7)*(r*h+r*r);
        System.out.println("Area of Prism : " +SA);
    }
}
