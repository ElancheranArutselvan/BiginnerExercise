package Seetha;

import java.util.Arrays;
import java.util.Objects;

public class Rough {
    public static void main(String[] args) {
        String[] words = {"Seetha", "raman", "elan", "keethana", "Seetha", "karthika", "vasi", "elan", "Seetha", "karthika"};
        Arrays.sort(words);
//        String[] output = new String[words.length];

        int i;
        for ( i = 0; i < words.length-1; i++) {

//            if(output.toString().indexOf(words[i])==-1){
//                output[output.length] = words[i];
            if (!Objects.equals(words[i], words[i + 1])) {
                System.out.println(words[i]);
            }
        }
//        outpot[j++] = words[words.length - 1];
//        System.out.println(words[i]);
//        for (int k = 0; k < outpot.length; k++) {
//            if (outpot[k] != null) {
//                System.out.println(outpot[k]);
//            }
//
//        }
//        System.out.println(output.toString());

    }
}