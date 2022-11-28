package JavaExercises;
import java.util.Scanner;
public class Divideby268 {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n,i=1;
        System.out.println("Find numbers which are divisible by 2,6& 8 UPTO ");
        n=inp.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0 && i%6==0 && i%8==0){
                System.out.println("Number " + i);
            }
        }
    }
}
