package Seetha;

import java.util.Arrays;
import java.util.Scanner;

public class PrimetoArray {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        int i = 2, a;
        System.out.println("Print prime numbers upto : ");
        a = prime.nextInt();
        while (i <= a){
            if (isPrime(i)) {
                int n = 0;
                int newArr[] = new int[n+1];
                int value = 6;
//                System.out.println(Arrays.toString(newArr));
                for(int j = 0; j<n; j++) {
                    newArr[n] = value;

                }

                System.out.println(Arrays.toString(newArr));

//                System.out.println(i);
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

