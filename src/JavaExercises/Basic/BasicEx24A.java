package JavaExercises.Basic;
import java.util.Scanner;
public class BasicEx24A {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int N = num.nextInt();
        System.out.printf("Is %d is a palindrome number ?\n",N);
        System.out.println(palindrome(N));
    }
    public static boolean palindrome(int N){
        String ab = String.valueOf(N);
        int i=0;
        int c= ab.length()-1;
        while (i<c){
            if(ab.charAt(i++) != ab.charAt(c--)){
                return false;
            }
        }return true;
    }
}
