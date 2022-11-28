package JavaExercises.BasicCollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<>();
        cars.add("Maruthi");
        cars.add("Ford");
        cars.add("Hundai");
        cars.add("Ambassador");
        cars.add("Rolls royce");
        System.out.println(cars);
        Collections.swap(cars,0,3);
        System.out.println(cars);
    }
}
