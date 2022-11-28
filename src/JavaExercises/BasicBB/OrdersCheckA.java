package JavaExercises.BasicBB;
import java.util.Scanner;
public class OrdersCheckA {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        float f1,f2,f3;
        System.out.println("Enter 1st number ");
        f1 = order.nextFloat();
        System.out.println(" Enter 2nd number ");
        f2 = order.nextFloat();
        System.out.println(" Enter 3rd number ");
        f3 = order.nextFloat();
        if(f1>f2 && f2>f3) {
            System.out.println("Numbers are in decreasing order");
        } else if (f1<f2 && f2<f3) {
            System.out.println("Numbers are in increasing order");
        }else {
            System.out.println("Numbers are neither Decreasing nor Increasing order");
        }
    }
    }

