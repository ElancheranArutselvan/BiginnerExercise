package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx3 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a : ");
        a = info.nextInt();
        System.out.println("Enter b : ");
        b = info.nextInt();
        System.out.println("Prouct of " + a + " * " + b + " is " + (a * b));
    }
}
