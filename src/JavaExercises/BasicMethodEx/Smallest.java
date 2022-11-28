package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter number 1 : ");
        a = data.nextInt();
        System.out.println("Enter number 2 : ");
        b = data.nextInt();
        System.out.println("Enter number 3 : ");
        c = data.nextInt();
        System.out.println("Enter number 4 : ");
        d = data.nextInt();
        System.out.println("Smallest number is : "+smallest(a,b,c,d));
    }
    public static int smallest(int n1,int n2,int n3,int n4){
       return Math.min(Math.min(Math.min(n1,n2),n3),n4);

    }
}
