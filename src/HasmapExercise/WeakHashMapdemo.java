package HasmapExercise;

import java.util.WeakHashMap;
import java.util.Set;

public class WeakHashMapdemo {
    public static void main(String[] args) {
        String gh = "Nellai";
        WeakHashMap he = new WeakHashMap();
        he.put(gh, 1000);
        he.put("Kovai", 1600);
        he.put("Sathapti", 1900);
        he.put("Sangamitra", 2100);
        gh = null;
        System.out.println(he);

        Set s = he.entrySet();

        System.out.println(s);
    }
}