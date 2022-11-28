package JavaExercises.Loop;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int num;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char choose;
        do
        {
            System.out.print("Enter the number: ");
            num = number.nextInt();
            if (num > max) {
                num=max;
            }
            if (num < min) {
            num = min;
        }
            System.out.print("Do you want to continue y/n? ");
            choose = number.next().charAt(0);

        }while(choose=='y' || choose == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest numbers: " + min);
    }
}
