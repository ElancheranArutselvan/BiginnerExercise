package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class FindSpecific {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = {21, 5, 62, 10, 2, 6, 9, 55, 33, 24, 65, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int n1;
        System.out.println("\nEnter number : ");
        n1 = num.nextInt();
                System.out.println("Array contains "+ n1+" : " + exist(arr, n1));
    }static boolean exist(int [] value,int a){
        for(int k : value){
            if(a==k){
                return true;
            }
        }return false;
    }
}