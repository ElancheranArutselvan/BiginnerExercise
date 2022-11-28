package JavaExercises.BasicBB;
import java.util.Scanner;
public class cubeFornNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, j;
        System.out.println(" how many numbers you want cube ? ");
        n= inp.nextInt();
        for(j=0;j<n;j++){
            System.out.println(" Cube of "+j+" number is : "+Math.pow(j,3));
        }
    }
}
