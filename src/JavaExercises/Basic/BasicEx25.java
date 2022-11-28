package JavaExercises.Basic;
import java.util.Scanner;
    public class BasicEx25 {
        public static void main(String[] arg) {
            int a, b;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter 1st number: ");
            a = in.nextInt();
            System.out.print("Enter 2nd number: ");
            b = in.nextInt();
            while(b != 0){
                int carry = a & b;
                a = a ^ b;
                b= carry << 1;
            }
            System.out.print("Sum: "+a);
            System.out.print("\n");

        }
    }