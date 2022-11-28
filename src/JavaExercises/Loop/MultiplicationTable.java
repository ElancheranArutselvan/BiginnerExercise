package JavaExercises.Loop;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n;

        System.out.print("Enter any number: ");
        n = obj.nextInt();

        System.out.println("Multiplication Table of " + n);

        for (int i = 1; i <= 15; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}