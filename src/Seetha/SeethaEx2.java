package Seetha;

import java.util.Arrays;

public class SeethaEx2 {
    public static void main(String[] args) {
        String input = "Black horse went to jogging";
        String[] actual = input.split(" ");
        String reverse[] = new String[5];
        for(int i =0 ;i< actual.length;i++) {
            System.out.print(actual[i]+" ");

        }
        System.out.println();
        for(int i= actual.length-1;i>=0;i--) {


//            reverse[i]=actual[i];

            for ( int j=0; j< actual.length;j++){
            reverse[j]=actual[i];}
            System.out.print(reverse[i]+" ");
//            System.out.println(Arrays.toString(reverse));
//            System.out.print(Arrays.toString(new String[]{reverse[i]}) +" ");
//            System.out.print(actual[i]+" ");
        }
        System.out.println();
//        for(int i=0;i< reverse.length;i++) {
//            if(actual[i]==reverse[i])
////            System.out.print(Arrays.toString(new String[]{reverse[i]}) +" ");
//            System.out.print(reverse[i]+" ");}
////        reverseArray =[] ;
////        function arrayfiller(times);
//        for(int i= actual.length-1;i>=0;i--) {
//            System.out.print(reverse.[i]+" ");
//        }


//        int i=0;
//        while(i>=0){
//            if(i== actual.length-1){
//                System.out.println(actual[i]);
//            }i--;
//
//        }
//int j;
//        for ( j=0; j<= actual.length;j++){
//            reverse[j]=actual[j];
//            System.out.println(reverse[j]);
//        }
    }
}