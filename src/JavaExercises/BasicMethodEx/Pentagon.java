package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class Pentagon {
    public static void main(String[] args) {
        Scanner side = new Scanner(System.in);
        double a;
        int n = 5;
        System.out.println("Enter Side value of pentagon : ");
        a=side.nextDouble();
        System.out.println("Area of pentagon : "+pentagonArea(n,a));
    }
    public static double pentagonArea(int n,double a){
        double area = (1.0/4)*Math.sqrt(n*(n+2*(Math.sqrt(n))))*a*a;
        return area;
    }
}
