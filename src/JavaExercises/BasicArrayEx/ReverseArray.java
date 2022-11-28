package JavaExercises.BasicArrayEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int[] sys = {45, 5, 76, 90, 67, 9, 34, 4, 66,270};
        for (int i = 0; i < sys.length; i++) {
            System.out.print(sys[i] + " ");
        }
        for (int j = 0; j < sys.length /2; j++) {
            int reverse = sys[j];
            sys[j] = sys[sys.length - j - 1];
            sys[sys.length - j - 1] = reverse;
        }
        System.out.println("\nReverse array : " + Arrays.toString(sys));
    }
}