package JavaExercises.BasicBB;
import java.util.Scanner;
public class NaturalNum {
    public static void main(String[] args)
{
    Scanner inp = new Scanner(System.in);
    int n;
    System.out.println("how many natural numbers do you want ");
      n = inp.nextInt();
    System.out.println ("\nThe first " +n+" natural numbers are:\n");
    int i;
    for (i=1;i<=n;i++)
    {
        System.out.println (i);
    }

}
}
