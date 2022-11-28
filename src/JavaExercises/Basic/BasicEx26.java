package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx26 {
    public static void main(String args[])
    {
        int a, b, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        a = s.nextInt();
        while(a > 0)
        {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}

