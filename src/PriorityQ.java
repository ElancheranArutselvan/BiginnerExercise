import java.util.PriorityQueue;

public class PriorityQ
{
    public static void main(String[] args) {

        PriorityQueue<String>pQ = new PriorityQueue<>();
        pQ.add("Ram");
        pQ.add("Abi");
        pQ.add("Siva");
        pQ.add("Yuvan");
        pQ.add("Abi");
        pQ.add("Lokesh");
        System.out.print(pQ + " ");
        System.out.println("\n"+pQ.peek());
        System.out.println("\n" + pQ.remove());
        System.out.println("\n" + pQ.peek());
        pQ.clear();
        System.out.println("\n" +pQ);
        System.out.println("\n"+pQ.poll());
    }
}
