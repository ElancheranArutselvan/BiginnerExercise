package JavaExercises;

import java.util.Scanner;

public class FactorialEx {
        public static void main(String[] args) {
        int n, factorial = 1;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter number to find Factorial ");
        n= num.nextInt();
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+n+" is "+factorial);
    }

}
