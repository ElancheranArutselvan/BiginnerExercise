package JavaExercises.Loop;
import java.util.Scanner;
public class SumofFraction {
    public static void main(String[] args)
    {
        Scanner fraction = new Scanner(System.in);
        int n;
        double sum = 0;
        System.out.println("Enter number of terms of series : ");
        n = fraction.nextInt();
        for(int i = 1; i <= n; i++)
        {
            sum += 1.0/i;
        }

        System.out.println("sum: " + sum);
    }
}
