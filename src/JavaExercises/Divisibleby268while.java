package JavaExercises;

import java.util.Scanner;

public class Divisibleby268while {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,i=1;
        System.out.println("Find numbers which are divisible by 2,6& 8 UPTO ");
        n=inp.nextInt();
        while (i<=n){
            if(i%2==0 && i%6==0 && i%8==0){
                System.out.println("Number " + i);
            }i++;
        }
    }
}

