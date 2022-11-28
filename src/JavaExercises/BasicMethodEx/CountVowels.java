package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String abc = input.nextLine();
        System.out.print("Number of  Vowels in the string: " + countVowels(abc)+"\n");
    }
    public static int countVowels(String def)
    {
        int count = 0;
        for (int i = 0; i < def.length(); i++)
        {
            if (def.charAt(i) == 'a' || def.charAt(i) == 'e' || def.charAt(i) == 'i'
                    || def.charAt(i) == 'o' || def.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
