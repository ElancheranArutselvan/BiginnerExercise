package Overridding;

public class PrivateMethodSubtraction {

        private void subtraction(int num1, int num2) {
            System.out.println("Inside super class method");
            System.out.println(num1 - num2);
        }

    }

    class Trace extends PrivateMethodSubtraction
    {
        void subtraction(int num1, int num2) {
            System.out.println("Inside sub class method");
            System.out.println(num1 - num2);
        }
        public static void main(String[] args) {
            Trace trace= new Trace();
            trace.subtraction(150, 100);
        }
    }

