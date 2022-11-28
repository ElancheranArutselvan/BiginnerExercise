package JavaExercises.BasicBB;
import java.util.Scanner;
public class OrderCheck {
    public static void main(String[] args) {
        Scanner order = new Scanner(System.in);
        int n;
        System.out.println(" How many numbers you need ? ");
        n= order.nextInt();
        float b [] =new float[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter "+(i+1)+" number : ");
            b[i]= order.nextFloat();
        }


    }
}
