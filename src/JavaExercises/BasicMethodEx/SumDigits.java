package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long number;
        System.out.println("Enter any number : ");
        number = obj.nextLong();
        System.out.println("Sum of Digits of "+number+" is : "+sumDigit(number));
    }
    public static int sumDigit(long a){
        int total =0;
        while(a>0){
            total +=(a%10);
            a/=10;
        }return total;
    }
}
