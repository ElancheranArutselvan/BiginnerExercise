import java.util.Scanner;
public class compop {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the value of x");
        x = myObj.nextInt();
        System.out.println("Enter the value of y");
        y = myObj.nextInt();
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        System.out.println(x!=y);
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println((x>y) && (y>x));
        System.out.println((x>y) || (x<y));
        System.out.println(!(x==y));

    }
}