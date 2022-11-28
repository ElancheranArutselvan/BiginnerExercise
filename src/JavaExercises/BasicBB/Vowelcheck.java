package JavaExercises.BasicBB;
import java.util.Scanner;
public class Vowelcheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any of alphabet: ");
        String Alpha;
        Alpha = in.next().toLowerCase();
        boolean uppercase = Alpha.charAt(0) >= 65 && Alpha.charAt(0) <= 90;
        boolean lowercase = Alpha.charAt(0) >= 97 && Alpha.charAt(0) <= 122;
        boolean vowels = Alpha.equals("a") || Alpha.equals("e") || Alpha.equals("i")
                || Alpha.equals("o") || Alpha.equals("u");

        if (Alpha.length() > 1)
        {
            System.out.println("Enter single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println(Alpha+" is Vowel");
        }
        else
        {
            System.out.println(Alpha+" is Consonant");
        }
    }
}
