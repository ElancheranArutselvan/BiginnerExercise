package JavaExercises.BasicArrayEx;

import java.util.Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int[] sys = {45, 5, 76, 6, 90, 67, 9, 45, 34, 4, 66, 27, 5};
        for (int i = 0; i < sys.length; i++) {
            System.out.print(sys[i] + " ");
        }
        Arrays.sort(sys);
        System.out.println("\n"+Arrays.toString(sys));
        int sl= sys.length-1;
        while (sl == sys.length-1) {
            sl--;
            System.out.println("Second largest number is : "+sys[sl]);

        }
    }
}