import java.util.Scanner;
public class assignop {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the value of num1");
        num1 = myObj.nextInt();
        System.out.println("Enter the value of num2");
        num2 = myObj.nextInt();
        num1 += num2;
        System.out.println(" Result is :" + num1);
        int a1, a2;
        System.out.println("Enter the values of a1");
        a1 = myObj.nextInt();
        System.out.println("Enter the values of a2");
        a2 = myObj.nextByte();
        a1 *=a2;
        System.out.println("the result is:" + a1);
        int b1,b2;
        System.out.println("Enter the values of b1");
        b1 = myObj.nextInt();
        System.out.println("Enter the values of b2");
        b2 = myObj.nextInt();
        b1 /= b2;
        System.out.println("Result is:" + b1);
    }
}