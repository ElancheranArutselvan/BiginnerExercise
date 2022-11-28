import java.util.Scanner;
public class Whileloopscan {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int a;
        System.out.println("Enter a");
        a = myObj.nextInt();
        while (a<10){
            System.out.println(a);
            a++;
        }

    }
}