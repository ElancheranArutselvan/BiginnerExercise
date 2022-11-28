package JavaExercises.BasicStringEx;

import java.util.Calendar;

public class Currentdateandtime {
    public static void main(String[] args) {
        Calendar current = Calendar.getInstance();
        System.out.println("Current Date and Time : ");
        System.out.format("%tB %te,%tY%n",current,current,current);
        System.out.format("%dH:%tM %tp%n",current,current,current);
    }
}
