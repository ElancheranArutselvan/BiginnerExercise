import java.util.Scanner;
public class Forloopscan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num;
        System.out.println("Enter num");
        num = myObj.nextInt();
        for(int a = 0; a<num; a += 10){
            System.out.println(a);
        }
    }
}