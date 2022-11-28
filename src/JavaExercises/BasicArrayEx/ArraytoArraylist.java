package JavaExercises.BasicArrayEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArraylist {
    public static void main(String[] args) {
        String [] sport = {"Cricket", "Baskrtball","vollyball","Football","kabadi","hockey"};
//        String [] sport = new String[] {"Cricket", "Baskrtball","vollyball","Football","kabadi","hockey"};
        ArrayList<String>game=new ArrayList<String>(Arrays.asList(sport));
        System.out.println(game);
    }
}
