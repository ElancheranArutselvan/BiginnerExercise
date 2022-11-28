package JavaExercises.BasicCollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class Insert1st {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Vollyball");
        sports.add("Kabadi");
        sports.add("BullTaming");
        System.out.println(sports);
        sports.set(0,"Baskertball");
        System.out.println(sports);
        sports.remove(2);
        System.out.println("\n"+sports);
        Collections.sort(sports);
        System.out.println("\n"+sports);
        Collections.shuffle(sports);
        System.out.println("\n"+sports);
        sports.ensureCapacity(8);
        sports.add("Wrestle");
        sports.add("Discthrow");
        sports.add("Caram");
        sports.add("Chess");
        sports.add("Cards");
        sports.add("Hurdle");
        System.out.println("\n"+sports);
        Collections.reverse(sports);
        System.out.println("\n"+sports);

    }
}
