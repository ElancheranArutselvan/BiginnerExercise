package HasmapExercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashEntry {
    public static void main(String[] args) {
        HashMap he = new HashMap();
        he.put( "Nellai", 1000);
        he.put("Kovai", 1600);
        he.put("Sathapti", 1900);
        he.put("Sangamitra", 2100);
        System.out.println(he);
        Set s = he.entrySet();
        System.out.println(s);
        Iterator i = s.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        while (i.hasNext()){
//            Object d = i.next();
//            Map.Entry f =(Map.Entry) d;
//            System.out.println(f.getKey());
//            System.out.println(f.getValue());
//        }
//        while (i.hasNext()){
//            Object d = i.next();
//            Map.Entry f =(Map.Entry) d;
//            Object g =f.getValue();
//            if(g.equals(2100)){
//            System.out.println(g);
//        }
//    }
//        while (i.hasNext()){
//            Object d = i.next();
//            Map.Entry f =(Map.Entry) d;
//            Object g =f.getValue();
//            Object name = f.getKey();
//            if(g.equals(2100)){
//                System.out.println(name);
//            }
//}
//        while (i.hasNext()){
//            Object d = i.next();
//            Map.Entry f =(Map.Entry) d;
//            Object g =f.getValue();
//            Object name = f.getKey();
//            if(g.equals(2100)){
//                f.setValue(2115);
//            }
//        }
        while (i.hasNext()){
            Object d = i.next();
            Map.Entry f =(Map.Entry) d;
            Object g =f.getValue();
            Object name = f.getKey();
            if(name.equals("Nellai")){
                f.setValue(2115);
            }
        }
        System.out.println(s);
    }}
