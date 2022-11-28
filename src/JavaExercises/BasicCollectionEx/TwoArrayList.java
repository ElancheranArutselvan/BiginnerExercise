package JavaExercises.BasicCollectionEx;

import java.util.ArrayList;

public class TwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>marks = new ArrayList<>();
        marks.add(55);
        marks.add(56);
        marks.add(78);
        marks.add(82);
        marks.add(49);
        System.out.println("\n"+marks);
        ArrayList<Integer>score = new ArrayList<>();
        score.add(88);
        score.add(90);
        score.add(76);
        score.add(49);
        score.add(55);
        System.out.println("\n"+score);
        ArrayList<String>compare = new ArrayList<>();
        for (int n : marks){
            String Yes  = "true";
            String No = "False";
            compare.add(String.valueOf(score.contains(n) ? Yes : No));
        }
        System.out.println("\n"+compare);
    }
}
