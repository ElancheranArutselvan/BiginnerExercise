package StreamsExercise;

import java.util.List;
import java.util.stream.Stream;

public class Random {
 

    public Stream<Integer> nextInt(int i) {

        List<Integer> list = null;

int a = 0;
        int j;
        for (j = 0; j < i; j = j + 2) {

    list.add(j);

//         System.out.println(j + " ");
//            System.out.println();
        }
    return (Stream<Integer>) list;
    }}
