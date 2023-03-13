package JavaExercises.BasicArrayEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoArraylist {
    public static void main(String[] args) {
        String [] sport = {"Cricket", "Baskrtball","vollyball","Football","kabadi","hockey"};
//        String [] sport = new String[] {"Cricket", "Baskrtball","vollyball","Football","kabadi","hockey"};
        ArrayList<String>game=new ArrayList<String>(Arrays.asList(sport));
        System.out.println(game);

        int[ ][ ] x={{1,2,3},{4,5,6}} ;

        for(int[ ] x1 :x){

            for(int x2 : x1) {

                System.out.println(x2);

            }

        }
        int[ ][ ] xy={{1,2,3},{4,5,6}};

        for(int i=0;i<xy.length;i++) {

            for(int j=0; j<xy[i].length;j++) {

                System.out.println(xy[i][j]);

            }

        }
    }
}
