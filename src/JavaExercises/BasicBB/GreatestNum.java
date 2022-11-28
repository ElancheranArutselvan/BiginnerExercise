package JavaExercises.BasicBB;
import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println("Enter how many numbers you want : ");
        n = num.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"number : ");
            a[i]=num.nextInt();
        }

        System.out.println("Greatest number is : ");

    }
}
