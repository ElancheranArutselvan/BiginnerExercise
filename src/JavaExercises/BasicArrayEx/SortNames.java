package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class SortNames {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.println("Enter no of elements in Array");
        n= inp.nextInt();
        String [] fruit =new String[n];
        String temp;
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++){
            fruit[i]=inp.nextLine();
        }
        for (int i=0;i<n;i++) {
            for (int j = 1 + i; j < n; j++) {
                if (fruit[i].compareTo(fruit[j])>0) {
                    temp = fruit[i];
                    fruit[i] = fruit[j];
                    fruit[j] = temp;
                }
            }
        }
        System.out.println("\nAlphabetical Order : ");
        for (int i=0; i<n-1;i++){
            System.out.print(fruit[i]+",");
        }
        System.out.print(fruit[n-1]);
    }

}
