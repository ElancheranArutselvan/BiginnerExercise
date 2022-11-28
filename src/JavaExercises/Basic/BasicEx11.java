package JavaExercises.Basic;
import java.util.Scanner;

public class BasicEx11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a : ");
        a = inp.nextInt();
        System.out.println("Enter b : ");
        b = inp.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(a + " is less than " + b);
        }
        else if (a >= b) {
            System.out.println(a + " is greater than or equal to " + b);
        } else if(a<=b) {
            System.out.println(a + " is less than or equal " + b);
        }
        else  {
            System.out.println(a + " is equal to " + b);
        }

    }
}