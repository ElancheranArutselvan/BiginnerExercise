package HasmapExercise;

import GuruABC.GuruA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cardata {
    public static void main(String[] args) {


        GuruA c1 = new GuruA("Ford", "Red", "Disel", 2010, 400000);
        GuruA c2 = new GuruA("BMW", "Red", "Disel", 2010, 400000);
        GuruA c3 = new GuruA("RR", "Red", "Disel", 2010, 400000);
        HashMap car = new HashMap<>();
        car.put(01,c1);
        car.put(02,c2);
        car.put(03,c3);
        System.out.println(car);
        Set h= car.entrySet();
        System.out.println(h);
        Iterator j = h.iterator();
//        while (j.hasNext()){
//            System.out.println(j.next());
//        }
//        while (j.hasNext()){
//            Map.Entry w =(Map.Entry)j.next();
//            Object o1 = w.getKey();
//            if(o1.equals(01))
//            System.out.println(o1);
////        }
//        while (j.hasNext()){
//            Map.Entry w =(Map.Entry)j.next();
//            Object o1 = w.getKey();
//            Object o2 = w.getValue();
//            if(o1.equals(01))
//                System.out.println(o2);
//        }
        while(j.hasNext()){
            Map.Entry w =(Map.Entry)j.next();
            Object o1 = w.getKey();
            Object o2 = w.getValue();
            GuruA carDetails = (GuruA)o2;
            if(o1.equals(01)){
                System.out.println(carDetails.getAge());
            System.out.println(carDetails.getDegree());
            }
            if(o1.equals(01)){
                carDetails.setAge(1555555);
                System.out.println(carDetails.getAge());
            }
        }
    }
}