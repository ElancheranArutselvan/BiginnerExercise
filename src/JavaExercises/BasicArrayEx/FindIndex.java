package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class FindIndex {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = {21,5,62,10,2,6,9,55,33,24,65,5};
        for(int i= 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int k;
        System.out.println("\nEnter a number from above array");
        k=num.nextInt();
        System.out.println(findIndex(arr,k));
    }
    static int findIndex(int[]aray,int t) {
        if (aray == null) {
            return -1;
        }
        int l = aray.length;
        int j = 0;
        while (j < l) {
            if (aray[j] == t) {
                return j;
            }
            j++;
        }return -1;
    }
}
