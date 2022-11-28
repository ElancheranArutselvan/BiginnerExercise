package JavaExercises.BasicBB;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner table = new Scanner(System.in);
        int t,n,i;
        System.out.println("Multiplicatio table number : ");
        t=table.nextInt();
        System.out.println("Number of terms : ");
        n=table.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(i+" * "+n+" = "+n*i);
        }

    }
}
