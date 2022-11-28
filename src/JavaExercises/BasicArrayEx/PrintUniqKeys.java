package JavaExercises.BasicArrayEx;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqKeys {
    public static void main(String[] args) {
        Integer [] value = {5,6,1,0,9,5,6,8,11,12,5,11,0};
        Set<Integer>uniq = new TreeSet<Integer>();
        uniq.addAll(Arrays.asList(value));
        System.out.println("uniqKeys : "+uniq);
        }
}
