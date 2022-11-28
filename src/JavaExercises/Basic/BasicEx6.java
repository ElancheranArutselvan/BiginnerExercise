package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx6 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int  A1,A2;
        System.out.println("Enter A1 : ");
        A1= info.nextInt();
        System.out.println("Enter A2 : ");
        A2= info.nextInt();
        System.out.println("Before swapping A1 and A2 is : "+A1+", "+A2);
        int  A3;
        A3=A1;
        A1=A2;
        A2=A3;
        System.out.println("After swapping A1 and A2 is : "+A1+", "+A2);

    }
}
