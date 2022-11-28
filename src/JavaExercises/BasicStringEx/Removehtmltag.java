package JavaExercises.BasicStringEx;

public class Removehtmltag {
    public static void main(String[] args) {
        String abc = "<p>I don't want <*>this p tag<\\p>";

        System.out.println(abc);
        abc= abc.replaceAll("\\<.*?\\>", "");
        System.out.println(abc);
    }
}
