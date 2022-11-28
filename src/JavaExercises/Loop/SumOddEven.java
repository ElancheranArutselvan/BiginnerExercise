package JavaExercises.Loop;
import java.util.Scanner;
public class SumOddEven {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a,even =0,odd=0;
        char choose;

        do
        {
            System.out.print("Enter any number ");
            a = input.nextInt();

            if( a % 2 == 0)
            {
                even += a;
            }
            else
            {
                odd += a;
            }

            System.out.print("Do you want to continue y/n? ");
            choose = input.next().charAt(0);

        }while(choose=='y');

        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
    }
}
