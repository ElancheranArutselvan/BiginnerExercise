package JavaExercises;

import java.util.Scanner;

public class Prime500while {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        int i = 2, a;
        System.out.println("Print prime numbers upto : ");
        a = prime.nextInt();
        while (i <= a){
            if (isPrime(i)) {

                System.out.println(i);
            }i++;
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

