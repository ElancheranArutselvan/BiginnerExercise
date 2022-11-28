package JavaExercises;
import java.util.Scanner;
public class Biggestof3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Enter 1st Number : ");
        n1 = num.nextInt();
        System.out.println("Enter 2nd Number : ");
        n2 = num.nextInt();
        System.out.println("Enter 3rd Number : ");
        n3 = num.nextInt();
        if(n1!=n2 && n2!=n3 && n1!=n3){
        if(n1>n2 && n1>n3){
            System.out.println(n1+" is the biggest of 3 given");
        } else if (n2>n1 && n2>n1) {
            System.out.println(n2+" is the biggest of all");
        }else {
            System.out.println(n3+" is the greatest");
        }
        }else {System.out.println("Either of Two or Three numbers are equal");}
    }
}
