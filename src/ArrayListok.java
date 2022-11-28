import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class ArrayListok {
    public static void main(String[] args) {
        ArrayList<Integer>num = new ArrayList<Integer>();
        num.add(53);
        num.add(78);
        num.add(36);
        num.add(15);
        num.add(96);
        num.add(23);
        num.add(10);
        for(int i : num){
            System.out.print(i+", ");
        }
        System.out.println("\n"+num.get(4));
        num.set(2,100);
        System.out.println("\n"+num+", ");
        Collections.sort(num);
        System.out.println("\n"+num);
        num.remove(5);
        System.out.print("\n"+num+" ,");
        System.out.println("\n"+num.size());
        num.clear();
        System.out.println("\n"+num);
    }
}
