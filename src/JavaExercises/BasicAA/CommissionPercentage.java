package JavaExercises.BasicAA;
import java.util.Scanner;
public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Double Amount, Percentage,Commission;
        System.out.println("Enter Amount : ");
        Amount = obj.nextDouble();
        System.out.println("Enter Percentage : ");
        Percentage = obj.nextDouble();
        Commission =Amount*Percentage/100;
        System.out.println(" Commission Obtained is : "+Commission);
    }
}
