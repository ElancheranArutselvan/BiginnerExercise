import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListmulti {
    public static void main(String[] args)throws ClassCastException {
        ArrayList multi = new ArrayList();
        multi.add("Elancheran ");
        multi.add('A');
        multi.add(31);
        multi.add(165.75);
        multi.add('#');
        System.out.println(multi);
        System.out.println("\n" + multi.contains(31));
        Iterator<Integer> j = multi.iterator();
        System.out.println("\n Using Iterator");
        while (j.hasNext()){
            System.out.println("\n"+j.next());
        }
    }
}
