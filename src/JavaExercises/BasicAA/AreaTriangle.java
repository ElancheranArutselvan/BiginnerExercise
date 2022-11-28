package JavaExercises.BasicAA;
import java.util.Scanner;
public class AreaTriangle { public static void main(String args[])
{

    Scanner data= new Scanner(System.in);

    System.out.println("Enter the width of:");
    double w= data.nextDouble();

    System.out.println("Enter the height:");
    double h= data.nextDouble();

    //Area of Triangle = (width*height)/2
    double Area=(w*h)/2;
    System.out.println("Area of Triangle is: " + Area);
}
}

