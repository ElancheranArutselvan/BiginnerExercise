import java.util.Scanner;
public class Arith {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a, b, sum, substract, multiply, modulus, increment, decrement;
        float divide;
        System.out.println("Enter values a and b");
         a = myObj.nextInt();
         b = myObj.nextInt();
        sum = a+b;
        System.out.println("Sum is:" + sum);
        substract = a-b;
        System.out.println("Substract is:" + substract);
        multiply = a*b;
        System.out.println("Multiply is:" + multiply);
        divide = (float) a/b;
        System.out.println("Divide is:" + divide);
        modulus = a%b;
        System.out.println("Modulus is:" + modulus);
        increment = ++a;
        System.out.println("Increment is:" + increment);
        decrement = --b;
        System.out.println("Decrement is:" + decrement);
    }
}