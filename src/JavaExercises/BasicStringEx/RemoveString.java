package JavaExercises.BasicStringEx;

public class RemoveString {
    public static void main(String[] args) {
        String abc = "Sachin is Greatest of all time Legentary cricketer";

        System.out.println("Actual is :" + abc);
        System.out.println(removeCharAt(abc,15));
    }

    private static String removeCharAt(String a,int pos) {
        return a.substring(0,pos)+a.substring(pos+1);

    }
}