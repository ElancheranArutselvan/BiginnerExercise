package JavaExercises.BasicBB;
import java.util.Scanner;

public class PositiveORnegative {
    public static void main(String[] args) {
        Scanner integer = new Scanner(System.in);
        int a;
        System.out.println("Enter an Integer : ");
        a=integer.nextInt();
        if(a>0){
            System.out.println(a+" is a Positive Integer");
        } else if (a<0) {
            System.out.println(a+" is a Negative Integer");
        }else{
            System.out.println(a+" is Zero");
        }
    }}
