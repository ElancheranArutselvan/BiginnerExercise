package Seetha;

import java.util.Scanner;
public class SeethaEx4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int position;
        int primenumber;
        System.out.println("Enter number :");
        primenumber = inp.nextInt();
        System.out.println("Enter Position : ");
        position = inp.nextInt();
        int[] prime = {1, 2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < prime.length; i++) {
            if (primenumber == prime[i]) {
                if (position == i) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        System.out.println("Enter any number");
        int number1 = inp.nextInt();
        boolean primeOrNot=checkPrime(number1);
        if(primeOrNot){
            System.out.println(number1+" is : Prime");
        }else {
            System.out.println(number1+" is : Not prime");
        }
    }

    public static boolean checkPrime(int number) {
        boolean flag = true;
        if (number <= 1) {
            flag = false;
            return flag;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }
}