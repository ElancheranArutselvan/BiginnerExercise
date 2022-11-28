package Seetha;

import java.util.Arrays;

public class SeethaEx2A {
    public static void main(String[] args) {
        String input = "Black horse went to jogging";
        String[] actual = input.split(" ");
        String[] reverse = new String[actual.length];
        for (int i = 0; i < actual.length; i++) {
            System.out.print(actual[i] + " ");
        }
        System.out.println();
        for (int i = actual.length - 1; i >= 0; i--) {
            for (int j = 0; j < actual.length; j++) {
                reverse[j] = actual[i];
            }
            System.out.print(reverse[i]+" ");

//            String abc = Arrays.toString(reverse);
//            System.out.println(abc);

//
//        System.out.println("\n"+Arrays.toString(reverse));

//        int i=0;
//       String f = Arrays.toString(reverse[i]);
//        System.out.println(f);

//        }  StringBuffer ad = new StringBuffer();
//        for(int k = 0; k< reverse.length;k++){
//            ad.append(reverse[k]);
//        }
//        String str = ad.toString();
//        System.out.println(str);

//        System.out.println(ConvertArrtoStr(reverse, " "));
        }


//    public static String ConvertArrtoStr(Object[] arr,String delimiter) {
//        StringBuilder ad = new StringBuilder();
//        for (Object obj : arr){
//            ad.append(obj.toString()).append(delimiter);}
//        return ad.substring(0, ad.length() - 1);
//    }


    }

}