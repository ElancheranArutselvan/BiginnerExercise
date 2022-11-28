package JavaExercises.BasicBB;
import java.util.Scanner;

public class NumbersEqual {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 1st number : ");
        a=info.nextInt();
        System.out.println("Enter 2nd number : ");
        b=info.nextInt();
        System.out.println("Enter 3rd number : ");
        c=info.nextInt();
        if((a==b)&&(b==c)) {
            System.out.println("All numbers are Equal");
        } else if ((a==b)||(b==c)||(c==a)) {
            System.out.println("Either of Two numbers are equal");
        } else{
            System.out.println("All numbers are not Different");
        }
    }
}
