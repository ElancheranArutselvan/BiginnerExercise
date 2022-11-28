package AccessClass;

public class StaticClass {
    static class Exercise{
        void wishes(){
            System.out.println("happy Birthday");
//            return false;
        }
    }

    public static void main(String[] args) {
      Exercise exercise=new Exercise();
        exercise.wishes();
    }

}
