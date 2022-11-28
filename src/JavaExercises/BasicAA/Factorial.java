package JavaExercises.BasicAA;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    int a, fact = 1;
    Scanner num = new Scanner(System.in);
        System.out.println("Enter number ");
        a= num.nextInt();
        for(int i=1; i<=a; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+a+" is "+fact);
    }
}
