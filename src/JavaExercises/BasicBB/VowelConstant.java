package JavaExercises.BasicBB;
import java.util.Scanner;
public class VowelConstant {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        System.out.println("Enter Alpha : ");
        char A = letter.next().charAt(0);
        int a = 10;
        char[] vowel = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
//        for //////(int i = 0; i < a;i++) {
        char B = A;int i=0;
        char c = vowel[i];
            while (i<a) {
                System.out.println(A + " is VOWEL");
                i++;
            }

            System.out.println("constant");
    }}