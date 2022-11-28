package JavaExercises.Loop;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
    int b,R=0,reminder=0;
        System.out.println("Enter the number you want reverse : ");
        b= data.nextInt();
        while (b>0){
            reminder = b%10;
            R=R*10+reminder;
            b/=10;
        }
        System.out.println("Reverse of an number is :" + R);
    }
}
