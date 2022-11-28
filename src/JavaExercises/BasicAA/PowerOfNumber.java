package JavaExercises.BasicAA;
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base, exponent;
        long value =1;
        System.out.println("Enter base value : ");
        base = inp.nextInt();
        System.out.println("Enter exponent value : ");
        exponent = inp.nextInt();
        while (exponent != 0){
            value*=base;
            exponent--;
        }
        System.out.println("Result is : "+value);
    }
}
