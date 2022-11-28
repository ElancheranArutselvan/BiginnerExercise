package JavaExercises.Basic;

import java.util.Arrays;

public class BasicEx21 {
    public static void main(String[] args) {
        int [] numbers = {25,65,35, 75};
        System.out.println("Before swapping : "+ Arrays.toString(numbers));
        int x = numbers[1];
        numbers[1] = numbers[numbers.length-2];
        numbers[numbers.length-2] =x;
        System.out.println("After Swapping : "+ Arrays.toString(numbers));
    }
}
