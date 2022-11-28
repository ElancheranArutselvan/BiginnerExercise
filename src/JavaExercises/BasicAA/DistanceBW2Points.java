package JavaExercises.BasicAA;
import java.util.Scanner;
public class DistanceBW2Points {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double x1,x2,y1,y2,Distance;
        System.out.println("Enter x1 : ");
        x1= obj.nextDouble();
        System.out.println("Enter x2 : ");
        x2= obj.nextDouble();
        System.out.println("Enter y1 : ");
        y1= obj.nextDouble();
        System.out.println("Enter y2 : ");
        y2= obj.nextDouble();
        Distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Distance between the given two points is : " + Distance);
    }}
