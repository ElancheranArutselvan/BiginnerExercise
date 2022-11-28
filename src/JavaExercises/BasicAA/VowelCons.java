package JavaExercises.BasicAA;
import java.util.Scanner;
public class VowelCons {
    public static void main(String[] args) {
        int i = 0;
        Scanner letter = new Scanner(System.in);
        System.out.println("Enter Alpha : ");
        char Alpha = letter.next().charAt(0);
        if(Alpha =='a'||Alpha=='A'||Alpha=='e'||Alpha=='E'||Alpha=='i'||Alpha=='I'||Alpha=='o'||Alpha=='O'||Alpha=='u'||Alpha=='U'){

            System.out.println(Alpha+" is vowel");
        }else if((Alpha>='a'&&Alpha<='z')||(Alpha>='A'&&Alpha<='Z')) {
            System.out.println(Alpha+" is constant");
        }else{
            System.out.println(Alpha+" is not an Alphabet");
        }

    }
}
