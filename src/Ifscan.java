import java.util.Scanner;
public class Ifscan {
    public static void main(String[] args) {
        Scanner myData = new Scanner(System.in);
        int a, b;
        String result;
        System.out.println("Enter a");
        a = myData.nextInt();
        System.out.println("Enter b");
        b = myData.nextInt();
        if(a>b){
            System.out.println("Happy Birthday");
        } else if (a<b) {
            System.out.println("Happy Wedding day");
        }else{
            System.out.println("Advance Wishes");
        }
        result = (a>b)?"Hello":"Hai";
        System.out.println(result);
    }
}