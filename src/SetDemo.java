import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String>hs = new HashSet<>();
        hs.add("Ram");
        hs.add("Abi");
        hs.add("Siva");
        hs.add("Yuvan");
        hs.add("Abi");
        hs.add("Lokesh");
        System.out.print(hs+" ");
        HashSet<String>hp = new LinkedHashSet<>();
        hp.add("Ram");
        hp.add("Abi");
        hp.add("Siva");
        hp.add("Yuvan");
        hp.add("Abi");
        hp.add("Lokesh");
        System.out.print("\n"+hp+" ");
        System.out.println("\n"+hp.size());
        TreeSet<String> ht = new TreeSet<>();
        ht.add("Ram");
        ht.add("Abi");
        ht.add("Siva");
        ht.add("Yuvan");
        ht.add("Abi");
        ht.add("Lokesh");
        System.out.print("\n"+ht+" ");
        HashSet<Integer>num = new LinkedHashSet<>();
        num.add(53);
        num.add(78);
        num.add(36);
        num.add(15);
        num.add(96);
        num.add(23);
        num.add(10);
            System.out.print("\n"+num+", ");
            for(int i=0;i<50;i++){
                if(num.contains(i)){
                    System.out.println("\n"+i+" Exist");
                }
            }
        }


    }

