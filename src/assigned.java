import java.util.Scanner;
public class assigned {
    public static void main(String[] args) {
        Scanner myInp = new Scanner(System.in);
        int x, y, z;
        System.out.println("Enter the value of x");
        x = myInp.nextInt();
        System.out.println("Enter the value of y");
        y = myInp.nextInt();
        System.out.println("Enter the value of z");
        z = myInp.nextInt();
        x += y+z;
        System.out.println("Result is:" + x);
        x -= y+z;
        System.out.println("x -= y+z is:" + x);
        x -= y-z;
        System.out.println("x -= y-z is:" + x);
        x -= y+z;
        System.out.println("x -= y+z is:" + x);
        y *= x*z;
        System.out.println("y *= x*z is:" + y);
        y *= x-z;
        System.out.println("y *= x-z is:" + y);

    }
}