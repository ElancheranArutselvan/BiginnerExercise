package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx4 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a : ");
        a= info.nextInt();
        System.out.println("Enter b : ");
        b= info.nextInt();
        System.out.println("Addition of " +a+" and "+b+" is "+ (a+b));
        System.out.println("Subtraction of " +a+" and "+b+" is "+ (a-b));
        System.out.println("Multiplication of " +a+" and "+b+" is "+ (a*b));
        System.out.println("Division of " +a+" and "+b+" is "+ (a/b));
        System.out.println("Modulo of " +a+" and "+b+" is "+ (a%b));
    }
}
