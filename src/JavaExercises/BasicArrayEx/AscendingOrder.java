package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class AscendingOrder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,temp;
        System.out.println("Enter no of elements in Array");
        n= inp.nextInt();
        int [] c=new int[n];
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++){
            c[i]=inp.nextInt();
        }
        for (int i=0;i<n;i++) {
            for (int j = 1 + i; j < n; j++) {
                if (c[i] > c[j]) {
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println("\nAscending order of given Array : ");
        for (int i=0; i<n-1;i++){
            System.out.print(c[i]+",");
        }
        System.out.print(c[n-1]);
    }

}
