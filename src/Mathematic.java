import java.util.Scanner;
import java.lang.Math;
public class Mathematic {
    public static void main(String[] args) {
        Scanner ourData = new Scanner(System.in);
        int a, b, c, e;
        float d;
        System.out.println("Enter value of a");
        a = ourData.nextInt();
        System.out.println("Enter value of b");
        b = ourData.nextInt();
        System.out.println("Smallest is:" + Math.min(a, b));
        System.out.println("Biggest is:" + Math.max(a, b));
        System.out.println("Enter value of c");
        c = ourData.nextInt();
        System.out.println("Square root is:" + Math.sqrt(c));
        System.out.println("Enter value of d");
        d = ourData.nextFloat();
        System.out.println("Absolute value is:" + Math.abs(d));
        System.out.println("Enter value of e");
        e = ourData.nextInt();
        System.out.println("Random is:" + Math.random());
        int tm = 450,pm = 90,total = 600;
        int percentage = (tm+pm)*100/600;
        System.out.println(percentage+"%\n");
    }
}