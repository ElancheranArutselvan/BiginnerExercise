package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class CheckLeap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = inp.nextInt();
        System.out.println("Is that "+year+" leap ? " +leapYear(year));
    }

    public static boolean leapYear(int year) {
        boolean a = (year % 4) == 0;
        boolean b = (year % 400 == 0) && (year % 100 == 0);
        boolean c = (year % 100) != 0;
        return a && (b || c);
    }
}