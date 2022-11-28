package interfaces;

class Car implements Vehicle{
    public void type() {
        System.out.println("Car is a four wheeler");
    }

    public void fuel() {
        System.out.println("fuel is desel");
    }
    public void maxSpeed() {
        System.out.println("Max Speed 180 Kmph");

    }
}
class Bike implements Vehicle{
    public void type() {
        System.out.println("Bike is a Two wheeler");
    }

    public void fuel() {
        System.out.println("fuel is petrol");
    }
    public void maxSpeed() {
        System.out.println("Max Speed 120 Kmph");

    }
}

class Main {
    public static void main(String[] args) {
        Car info = new Car();
        Bike information = new Bike();
        info.type();
        info.fuel();
        info.maxSpeed();
        information.type();
        information.fuel();
        information.maxSpeed();
            }


        }



