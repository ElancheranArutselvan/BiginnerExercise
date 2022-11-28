package JavaExercises;
import java.util.Scanner;
public class ScannerEx {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
 int a, b,c,d,e,f,h;
 double g;
        System.out.println("Enter a : ");
        a= inp.nextInt();
        System.out.println("Enter b : ");
        b=inp.nextInt();
        System.out.println("Enter c: ");
        c=inp.nextInt();
        System.out.println("Cocade of a,b,c is : " + a+b+c);
       int i = a+b+c;
        System.out.println("Addition of a,b,c is : " + i);
        System.out.println("Enter d : ");
        d=inp.nextInt();
        e = d-a;
        System.out.println("Substraction of d and a is : " + e);
        f = b*c*d;
        System.out.println("Multiplication of b,c,d is : " + f);
        System.out.println("a/b is : " + a/b);
        System.out.println(("a%b is : " + a%b));
        System.out.println("Enter g: ");
//        g=inp.nextInt();
        g = inp.nextDouble();
        System.out.println("Enter h : ");
        h= inp.nextInt();
        double j = g/h ;
//       double j = inp.nextDouble();
        System.out.println("divide g by h is : " + j);
    }
}
