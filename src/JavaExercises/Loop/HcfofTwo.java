package JavaExercises.Loop;
import java.util.Scanner;
public class HcfofTwo {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the 1st number ");
        dividend = number.nextInt();

        System.out.print("Enter the 2nd number ");
        divisor = number.nextInt();

        do
        {
            remainder = dividend % divisor;

            if(remainder == 0)
            {
                hcf = divisor;
            }
            else
            {
                dividend = divisor;
                divisor = remainder;
            }

        }while(remainder != 0);

        System.out.println("HCF: " + hcf);
    }
}
