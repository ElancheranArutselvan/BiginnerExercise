package JavaExercises.BasicArrayEx;

import java.util.Arrays;

public class DiffBWmaxMin {
    public static void main(String[] args) {
        int [] num = {10,50,80,35,95,15,30,45,98,75,68};
        System.out.println("Actual array : "+ Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Ascending Order : "+ Arrays.toString(num));
        int d = num[num.length-1]-num[0];
        System.out.println("Difference between Max & Min value of array is : "+d);
    }
}
