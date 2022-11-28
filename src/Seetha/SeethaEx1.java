package Seetha;

import java.util.Scanner;
public class SeethaEx1 {
    public static void main(String[] args) {
        Scanner alpha = new Scanner(System.in);
        String input = "Jack and jill went up the hill come back in the evening";
        char[] l = input.toCharArray();
        System.out.println("Enter Character : ");
        char s = alpha.next().charAt(0);
        int len = l.length;
        System.out.println(len);
        for(int i=0;i<len;i++){
            if(s==l[i]){
                System.out.println("position of char "+s+"is "+i);
            }
        }
    }
}