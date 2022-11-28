package JavaExercises.BasicBB;
import java.util.Scanner;
public class OddandSum {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int a,n,sum=0;
    System.out.print("Enter number of terms: ");
    n = in.nextInt();
    System.out.println ("\nThe odd numbers are :");
    for(a=1;a<=n;a++)
    {
        System.out.println (a*2-1);
            sum+=(a*2)-1;
        }
        System.out.println ("The Sum of odd Natural Number upto " +n+" terms is: " +sum);
    }
}

