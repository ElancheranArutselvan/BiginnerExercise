package JavaExercises.BasicAA;
import java.util.Scanner;
public class CompInterest {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double Amount , RI, Time, Principle,N;
        System.out.println("Enter Principle sum : ");
        Principle = info.nextDouble();
        System.out.println("Enter Rate of Interest : ");
        RI = info.nextDouble();
        System.out.println("Enter Time Period : ");
        Time = info.nextDouble();
        Amount =0.0;
        N =(100+RI)/100;
        Amount=Principle*Math.pow(N,Time);
        System.out.println("Compound Interest for Rs."+Principle+" is : "+ (Amount-Principle));

    }
}
