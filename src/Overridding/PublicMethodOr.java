package Overridding;

public  class PublicMethodOr {

       public void eat()
        {
            System.out.println("Idli with sambaar");
        }
    }

    class Dosa extends PublicMethodOr {

        public void eat(){
            System.out.println("Dosa with Vadacurry");
        }
    }

    class PublicMethodEx11{

        public static void main(String args[])
        {
            PublicMethodOr publicMethodOr = new PublicMethodOr();
            Dosa dosa = new Dosa();

            publicMethodOr.eat();
            dosa.eat();

            PublicMethodOr publicMethod1 = new Dosa();
            publicMethod1.eat();
        }
    }

