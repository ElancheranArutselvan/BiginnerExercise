package JavaExercises.BasicAA;
import java.util.Scanner;
public class SurfaceAreacube {
    public static void main(String[] args) {
        double A,SA;
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter side value  : ");
        A = sides.nextDouble();
        SA =4*A*A;
        System.out.println("Area of Prism : " +SA);
    }
}
