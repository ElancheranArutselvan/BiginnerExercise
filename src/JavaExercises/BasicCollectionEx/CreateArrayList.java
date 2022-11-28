package JavaExercises.BasicCollectionEx;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String>sports = new ArrayList<String>();
        sports.add("Cricket");
        sports.add("Football");
        sports.add("Vollyball");
        sports.add("Kabadi");
        sports.add("BullTaming");
        System.out.println(sports);
        for(String i:sports){
            System.out.println("\n"+i);
        }
    }
}
