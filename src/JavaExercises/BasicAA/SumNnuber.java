package JavaExercises.BasicAA;
import java.util.Scanner;
public class SumNnuber {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n, sum = 0;
        System.out.println("How many numbers to sum");
    n = inp.nextInt();
    int c[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("Enter number "+ (i+1) +":");
        c[i]= inp.nextInt();
    }for(int i=0;i<n;i++){
        sum+=c[i];
        }
        System.out.println("sum of "+n+" numbers is "+sum);
    }
    }
