package AccessClass;

public class CPrivate {
    private class Exercise{
        void wishes(){
            System.out.println("happy Birthday");
        }
    }
    void display(){
        Exercise exercise= new Exercise();
        exercise.wishes();
    }

    public static void main(String[] args) {
        StaticClass.Exercise exercise=new StaticClass.Exercise();
        exercise.wishes();
    }

}
