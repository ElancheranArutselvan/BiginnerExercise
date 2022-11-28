package JavaExercises.BasicBB;
import java.util.Scanner;

public class LeapORnot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int Y;
        System.out.println("Enter Year : ");
        Y = obj.nextInt();
        if(Y%4 == 0){
            System.out.println(Y+" is a leap year and has 366 days");
        }else {
            System.out.println(Y+" is a leap year and has 365 days");
    }}
}
