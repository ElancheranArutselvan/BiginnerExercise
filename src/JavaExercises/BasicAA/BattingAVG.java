package JavaExercises.BasicAA;
import java.util.Scanner;
public class BattingAVG {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    int innings, NotOuts;
    Double runs,Average;
        System.out.println("Enter total Runs Scored : ");
        runs = inp.nextDouble();
        System.out.println("Enter No.of Innings played : ");
        innings = inp.nextInt();
        System.out.println("Enter No.Of Notouts : ");
        NotOuts = inp.nextInt();
        Average = runs/(innings-NotOuts);
        System.out.println("Batting average is : "+Average);
    }
}
