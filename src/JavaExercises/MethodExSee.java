package JavaExercises;
import java.util.Scanner;
public class MethodExSee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2;
        char O;
        System.out.println("Enter 1st number : ");
        n1= inp.nextInt();
        System.out.println("Enter operator from '+','-','*','/','%' : ");
        O=inp.next().charAt(0);
        System.out.println("Enter 2nd number : ");
        n2= inp.nextInt();
        if(O=='+'){
        System.out.println("Addition is : "+add(n1,n2));
    } else if (O=='-') {
            System.out.println("Substraction is : "+sub(n1,n2));

        }else if (O=='*') {
            System.out.println("Multiplication is : "+multiply(n1,n2));

        }else if (O=='/') {
            System.out.println("Division is : "+divide(n1,n2));

        }else if (O=='%') {
            System.out.println("Modulus is : "+modulus(n1,n2));

        }else{
            System.out.println("Invalid Operator");
        }
    }
    static int add(int a,int b){
        int c=a+b;
        return c;
    } static int sub(int a,int b){
        int c= a-b;
        return c;
    }static int multiply(int a,int b){
        int c= a*b;
        return c;
    }static int divide(int a,int b){
        int c= a/b;
        return c;
    }static int modulus(int a,int b){
        int c= a%b;
        return c;
    }
}
