import java.util.Scanner;
public class Cond {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a");
        a = myObj.nextInt();
        System.out.println("Enter the value of b");
        b = myObj.nextInt();
        System.out.println(a>b);
        boolean boolObj1 = new Boolean("True");
        boolean boolObj2 = new Boolean("False");
        boolean decision = boolObj1==boolObj2;
        System.out.println("Are equal:" + decision);
    }
}