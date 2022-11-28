package Seetha;
import java.util.Arrays;
public class rough1 {
        public static void main(String[] args) {
            String[] words = {"Seetha", "raman", "elan", "keethana", "Seetha", "karthika", "vasi", "elan", "Seetha", "karthika"};
           Arrays.sort(words);
            String[] uniq = removedup(words);
            for (int k = 0; k < uniq.length; k++) {
            if(uniq[k] != null) {
                System.out.println(uniq[k]);
            }

        }

        }

    public static String[] removedup(String arr[]){
        String[] outpot = new String[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                outpot[j++] = arr[i];

            }
        }
        outpot[j++] = arr[arr.length - 1];
        return outpot;
    }
}
