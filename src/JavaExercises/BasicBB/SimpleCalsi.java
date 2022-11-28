package JavaExercises.BasicBB;
import java.util.Scanner;
public class SimpleCalsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b;
        System.out.println(" Enter value of a");
        a= input.nextDouble();
        System.out.println(" Enter value of b");
        b= input.nextDouble();
        System.out.println("Choose operator from '-','+','*','/','^' ");
        char c=input.next().charAt(0);

        if(c=='+'){
            System.out.println(a+" + "+b+" = "+(a+b));
        }else if(c=='-'){
            System.out.println(a+" - "+b+" = "+(a-b));
        }else if(c=='*'){
            System.out.println(a+" * "+b+" = "+(a*b));
        }else if(c=='/'){
            System.out.println(a+" / "+b+" = "+(a/b));
        }else if(c=='^'){
            System.out.println(a+" ^ "+b+" = "+Math.pow(a,b));
        }else{
            System.out.println("Invalid Operator");
        }
    }
}
