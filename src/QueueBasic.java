import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(56);
        qu.add(45);
        qu.add(24);
        qu.add(53);
        qu.add(16);
        qu.add(78);
        System.out.print(qu + " ");
        System.out.println("\n"+qu.peek());
        System.out.println("\n" + qu.remove(16));
        System.out.println("\n" +qu);
        System.out.println("\n" + qu.peek());
        qu.clear();
        System.out.println("\n" +qu);
        System.out.println("\n"+qu.poll());
    }
}
