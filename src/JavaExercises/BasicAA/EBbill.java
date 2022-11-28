package JavaExercises.BasicAA;
import java.util.Scanner;
public class EBbill {
    public static void main(String[] args) {
        int Units;
        double Charge = 0;
        Scanner usage = new Scanner(System.in);
        System.out.println("Enter consumed units");
        Units = usage.nextInt();
        if(Units<=100){
            Charge = Units*1.5;
        }else if(Units<=250){
            Charge = 100*1.5+(Units-100)*2;
        } else {
            Charge = 100*1.5+150*2+(Units-250)*4;
        }System.out.println("Your payable amount is : "+Charge);
    }
}
