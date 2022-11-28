package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class Avgof3 {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = inp.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = inp.nextDouble();
        System.out.print("Enter third number: ");
        double n3 = inp.nextDouble();
        System.out.print("The average value is " + average(n1,n2,n3)+"\n" );
    }

    public static double average(double num1, double num2, double num3)
    {
        return (num1 + num2 + num3) / 3;
    }
}
