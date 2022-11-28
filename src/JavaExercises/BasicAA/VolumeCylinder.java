package JavaExercises.BasicAA;
import java.util.Scanner;
public class VolumeCylinder {
    public static void main(String[] args)
    {
    double R,H;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter Radious : ");
    R = inp.nextDouble();
    System.out.println("Enter Height : ");
    H = inp.nextDouble();
    double VoCl = (22.0/7*R*R*H);
    System.out.println("Area of Parallelogram is : "+VoCl);
}
}
