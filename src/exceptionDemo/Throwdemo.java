package exceptionDemo;

public class Throwdemo {
    public static void main(String[] args) throws Exception {
        int a, b;
        a = 25;
        b = 20;
        if (a>b) {
            throw new Exception("Enter a correct value");

        }else {
            System.out.println("Have a better day");
        }
    }
}

