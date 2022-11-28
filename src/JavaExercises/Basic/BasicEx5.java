package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx5 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int a, b, c, d, e;
        System.out.println("Enter a: ");
        a = info.nextInt();
        System.out.println("Enter b: ");
        b = info.nextInt();
        System.out.println("Enter c: ");
        c = info.nextInt();
        System.out.println("Enter d: ");
        d = info.nextInt();
        System.out.println("Enter e: ");
        e = info.nextInt();
        System.out.println("Average of a,b,c,d and e = " + (a + b + c + d + e) / 5);
    }
}
