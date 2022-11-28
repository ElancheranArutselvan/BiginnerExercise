package JavaExercises.BasicArrayEx;

import java.util.Arrays;

public class Left0Right1 {
    public static void main(String[] args) {
        int ab[] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1};
        System.out.println("Array : " + Arrays.toString(ab));
        int ab_size;
        int l = 0, R = ab.length - 1;
        while(l<R){
            while (ab[l]==0 && l<R)
                l++;
            while (ab[R]==1 && l<R)
                R--;
        if (l < R) {
            ab[l] = 0;
            ab[R] = 1;
            l++;
            R--;
        }
    }
        System.out.println("After Segregation : " + Arrays.toString(ab));
        }
}
