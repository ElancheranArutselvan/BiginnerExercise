package JavaExercises.Loop;
import java.util.Scanner;
public class Fabonacci {
    public static void main(String[] args)
    {
        Scanner fabonacci = new Scanner(System.in);
        int n, firstTerm = 0, secondTerm = 1, thirdTerm;
        System.out.println("Enter number of terms of series : ");
        n = fabonacci.nextInt();

        System.out.print(firstTerm + ", " + secondTerm + ", ");

        for(int i = 3; i <= n; i++)
        {
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + ", ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }
}
