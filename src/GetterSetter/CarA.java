package GetterSetter;

import static GetterSetter.Car.name;
import static GetterSetter.Car.plus;

public class CarA {
    public static void main(String[] args) {
        Car A1 = new Car();
        A1.setabcd("Ford");
        System.out.println(A1.getabcd());
        String name = "BMW";
        System.out.println(name);
        name("Benz");
        System.out.println(plus(60,40));
//        System.out.println(Bro());
    }
}
