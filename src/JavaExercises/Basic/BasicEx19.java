package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx19 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Seconds : ");
        int a = inp.nextInt();
        int b =a/60;
        int c = b/60;
        int d = b%60;
        int e = a%60;
        System.out.printf("Time is = "+ c +":"+d+":"+e);
    }

}
