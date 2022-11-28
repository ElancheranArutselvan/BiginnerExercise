package JavaExercises.BasicAA;
import java.util.Scanner;
public class VolumeCone {
    public static void main(String[] args) {
        double r, h, VoCo;
        Scanner sides = new Scanner(System.in);
        System.out.println("Enter radius : ");
        r = sides.nextDouble();
        System.out.println("Enter Height : ");
        h = sides.nextDouble();
        VoCo =(22.0*r*r*h)/(7*3);
        System.out.println("Area of Prism : " +VoCo);
    }
}
