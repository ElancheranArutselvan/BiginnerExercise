package JavaExercises;
import java.util.Scanner;
public class BoyGirl {
    public static void main(String[] args) {
        Scanner gender = new Scanner(System.in);
        int a;
        System.out.println("Enter 0 or 1");
        a = gender.nextInt();
        if(a==0){
            System.out.println(" I am a boy ");
        }else{
            System.out.println(" I am a girl ");
        }
    }
}
