package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class AvgofArraay {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] arr = {21,5,62,10,2,6,9,55,33,24,65,5};
        for(int i= 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int k= arr.length;
        int j=0,sum=0;
        for(j=0;j< arr.length;j++){
            sum +=arr[j];
        }
        System.out.println("\nAverage of Array is : "+sum/ arr.length);

    }
}
