import java.util.LinkedList;

public class LinkedlistOk {
    public static void main(String[] args) {
        LinkedList<Integer>list = new LinkedList<Integer>();
        list.add(53);
        list.add(78);
        list.add(36);
        list.add(15);
        list.add(96);
        list.add(23);
        list.add(10);
        list.add(36);
        for(int i : list){
            System.out.print(i+", ");
        }
        list.addFirst(101);
        list.addLast(200);
        System.out.print("\n"+list);
        list.removeFirst();
        list.removeLast();
        System.out.println("\n"+list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(3));
    }
}
