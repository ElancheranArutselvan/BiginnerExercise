package JavaExercises.Loop;
import java.util.Scanner;
public class CounintegerType {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int number, countPositive = 0, countNegative = 0, countZero = 0;
        char choose;
        do
        {
            System.out.print("Enter the number ");
            number = inp.nextInt();

            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }

            System.out.print("Do you want to continue y/n? ");
            choose = inp.next().charAt(0);

        }while(choose=='y' || choose == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }
}
