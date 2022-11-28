package Seetha.ClassObjectInheritance;

abstract class GreetAbstract {
    abstract void sayHello();
    abstract void calculator();

    public void print() {
        System.out.println("Welcome");
    }
}
class GreatA extends GreetAbstract{


    void sayHello() {
        System.out.println(" Welcome to the World of DisneyLand");

    }
    void calculator() {
        System.out.println("Invention of Calculator is worthy");
    }
    public void printA() {
        super.print();
    }
        public void print() {
        System.out.println("Tiger has very powerful claws");
    }
}
class GreetB extends GreetAbstract{
    void sayHello() {
        System.out.println("hello guys, everyone make sure to participate event ");
    }
    void calculator() {
        System.out.println(" Human brains are more powerful than Calci the machine");
    }

    @Override
    public void print() {
        System.out.println("Mohammed Ali has fast foot moment than tyson ");
    }
}
class AsItIs{
    public static void main(String[] args) {
        GreatA greatA = new GreatA();
        greatA.sayHello();
        greatA.calculator();
        greatA.print();
        greatA.printA();
        GreetB greetB = new GreetB();
        greetB.sayHello();
        greetB.calculator();
        greetB.print();
//       Dont creat object for Parent Abstract class to call regular method, its unfair, not acceptable//

//        GreetAbstract greetAbstract = new GreetAbstract() {
//            void sayHello() {
//            }
//            void calculator() {
//
//            }
//        };
//        greetAbstract.print();

    }
}
