import java.util.Scanner;
public class Arraysscan {
    public static void main(String[] args) {
    Scanner myInp = new Scanner(System.in);
        String A1, A2, A3, A4;
        System.out.println("Enter A1");
        A1 = myInp.nextLine();
        System.out.println("Enter A2");
        A2 = myInp.nextLine();
        System.out.println("Enter A3");
        A3 = myInp.nextLine();
        System.out.println("Enter A4");
        A4 = myInp.nextLine();
        String[] sports = {A1, A2, A3, A4};
        System.out.println(sports[1]);
        sports [2] = "Basketball";
        System.out.println(sports[2]);
        System.out.println(sports.length);
        int a, b, c, d;
        System.out.println("Enter a");
        a = myInp.nextInt();
        a = a;
        b = (a+2);
        c = (b+2);
        d = (c+2);
        int[] prime = {a, b, c, d};
        System.out.println(prime[2]);
        prime[3] = 17;
        System.out.println(prime[3]);
        System.out.println(prime.length);
    }
}