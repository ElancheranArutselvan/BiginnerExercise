package JavaExercises.BasicBB;
import java.util.Scanner;
public class SumAvg {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double sum =0.0;
        System.out.println(" How many numbers you need ? ");
        a= inp.nextInt();
        int b [] =new int[a];
        for(int i=0; i<a;i++){
            System.out.println("Enter "+(i+1)+" number : ");
        b[i]= inp.nextInt();
        }for(int j=0;j<a;j++){
        sum+=b[j];
        }
        System.out.println("Sum of the given numbers is : "+sum);
       double Average = sum/a;
        System.out.println("Avg of given numbers is : "+Average);
    }
}
