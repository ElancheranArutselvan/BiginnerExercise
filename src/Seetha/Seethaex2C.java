package Seetha;

import java.util.Arrays;

public class Seethaex2C {
    public static void main(String[] args) {
        String input = "Black horse went to jogging";
        System.out.println(input.length());
        String[] actual = input.split(" ");
        String[] reverse = new String[actual.length];
        for (int i = 0; i < actual.length; i++) {
            System.out.print(actual[i] + " ");
        }
        String ab = Arrays.toString(actual);
        System.out.println("/n"+ab);
        System.out.println(ab.length());
        int j = 0;
        for (int i = actual.length - 1; i >= 0; i--) {
//            for (int j = 0; j < actual.length; j++) {
            reverse[j++] = actual[i];
//            }
//            System.out.println(reverse[i]);
        }

        System.out.print(String.join(",", reverse));
    }
}