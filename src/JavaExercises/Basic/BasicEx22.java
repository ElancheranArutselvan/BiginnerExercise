package JavaExercises.Basic;

import java.util.Arrays;

public class BasicEx22 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 89, 67, 44, 78, 79, 45, 34, 1, 5, 8, 56, 87, 77, 66, 55};
        int odd = 0, even = 0;
        System.out.println(" Actual Array : " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.format("\n Even numbers in the array : %d",even);
        System.out.printf("\n Odd numbers in the array : %d",odd);
    }
}