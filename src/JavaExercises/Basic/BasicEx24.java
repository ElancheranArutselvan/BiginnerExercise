package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx24 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int B = obj.nextInt();
        if(B/B == 0){
            System.out.println(B+" is a polindrome number");
        }else {
            System.out.println(B+" is not a polyndrome");
        }
    }
}
