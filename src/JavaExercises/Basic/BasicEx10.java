package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long c;
        System.out.println("Enter C: ");
        c=inp.nextInt();
        System.out.println("Sum of digits of " +c+" is "+addDigits(c));
    }
    public static int addDigits(long d){
        int i = 0;
        while (d!=0){
            i += d % 10;
            d /= 10;
        }return i;
    }
}
