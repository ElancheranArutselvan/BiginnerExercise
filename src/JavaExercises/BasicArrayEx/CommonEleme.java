package JavaExercises.BasicArrayEx;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CommonEleme{
    public static void main(String[] args) {
        int[] order2 = {55, 78, 75, 2, 6, 3, 46, 99, 14, 15, 89, 100};
        int[] order1 = {2, 6, 55, 33, 8, 59, 62, 47, 56, 15, 3, 5, 98};
        System.out.println("Array 1 : " + Arrays.toString(order1));
        System.out.println("\nArray 2 : " + Arrays.toString(order2));
        for (int i = 0; i < order1.length; i++) {
            for (int j = 0; j < order2.length; j++) {
                if (order1[i] == order2[j]) {
                    System.out.println("Common Elements are " + order2[j]);
                }
            }
        }
    }




}
