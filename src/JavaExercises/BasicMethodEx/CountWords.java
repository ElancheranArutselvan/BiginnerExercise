package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String abc = obj.nextLine();
        System.out.println("No of words in string : "+Count(abc));
    }
    public static int Count (String def){
        int add = 0;
//            System.out.println(def.substring(def.length() - 1));
            if(!(" ".equals(def.substring(0, 1))) || !(" ".equals(def.substring(def.length() - 1)))){
        for(int i=0;i<def.length();i++) {
            if (def.charAt(i) == ' ') {
                add++;
            }
        }
            add = add + 1;

        }return add;
    }
}
