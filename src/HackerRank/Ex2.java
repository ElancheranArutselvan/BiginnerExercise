package HackerRank;

import java.util.Scanner;

public class Ex2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter t");
        int t=in.nextInt();
        System.out.println("Enter a");
        int a = in.nextInt();
        System.out.println("Enter b");
        int b = in.nextInt();
        System.out.println("Enter n");
        int n = in.nextInt();
        int j=0;
        double result=0;
        for(int i=0;i<t;i++){

            while(j<n){
                result=(a+Math.pow(2, j)*b);
                System.out.print(result+" ");
                j++;
            }
            result++;
        }
//
        in.close();
    }

}
