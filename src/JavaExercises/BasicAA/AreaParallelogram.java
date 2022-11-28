package JavaExercises.BasicAA;
import java.util.Scanner;
public class AreaParallelogram {
    public static void main(String[] args) {
        double s1,s2;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter side 1 : ");
        s1 = inp.nextDouble();
        System.out.println("Enter side 2 : ");
        s2 = inp.nextDouble();
        double Area = s1*s2;
        System.out.println("Area of Parallelogram is : "+Area);
    }
}
