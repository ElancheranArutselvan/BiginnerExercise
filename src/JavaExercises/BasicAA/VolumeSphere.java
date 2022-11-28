package JavaExercises.BasicAA;
import java.util.Scanner;
public class VolumeSphere {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the radius:");
        double R = obj.nextDouble();
        double VoSp = (22 * 4 * R * R * R) / (3 * 7);
        System.out.println("Volume of Sphere is: " + VoSp);
    }
}
