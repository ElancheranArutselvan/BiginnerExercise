package JavaExercises;
import java.util.Scanner;
public class BiggestNum {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st Number : ");
        a = value.nextInt();
        System.out.println("Enter 2nd Number : ");
        b = value.nextInt();
        System.out.println("Enter 3rd Number : ");
        c = value.nextInt();
        if(a>b && b>c){
            System.out.println(a + " a is the biggest number");
        } else if (b>a && a>c) {
            System.out.println(b + " b is the biggest number");
        }else if(c>b && b>a){
            System.out.println(c + " c is the biggest number");
        }else if(a==b && a>c) {
        System.out.println(a + " a and b " + b + " are biggest number");
        }else if(a==c && a>b) {
        System.out.println(a + " a and c " + c + " are biggest number");
        }else if(b==c && b>a) {
        System.out.println(b + " b and c " + c + " are biggest number");
        }else if(b==c && a>c) {
        System.out.println(a + " a is the biggest number");
        }else if(a==c && b>a) {
        System.out.println(b + " b is the biggest number");
        }else if(a==b && c>a) {
        System.out.println(c + " C is the biggest number");
        }else {
            System.out.println("All are Equal");
        }
    }
}
