package JavaExercises.BasicAA;
import java.util.Scanner;
public class AreaCircle {
        public static void main(String args[])
        {

            Scanner obj= new Scanner(System.in);

            System.out.println("Enter the radius:");
            double R= obj.nextDouble();
            double  area=(22*R*R)/7 ;
            System.out.println("Area of Circle is: " + area);
//            System.out.printf("Area of circle is : " + (String.valueOf(Math.PI)*R*R));

        }
    }

