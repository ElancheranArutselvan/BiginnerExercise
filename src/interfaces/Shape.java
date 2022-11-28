package interfaces;
interface Shape {
    public void square();
}
interface Rectangle {
    public void area();
}
interface Rectangle1{
    public void cuboid(int a,int b,int c);
}
interface Data {
    public void detail(String s, char a, int age, float b, String id);

    }
abstract class Triangle{
    abstract void area1test();
}
class Print extends Triangle implements Shape,Rectangle, Rectangle1,Data{
    void area1test() {
        System.out.println("Abstract");
    }

    public void square() {
        String property = "All sides equal";
        System.out.println("Square has " + property);
    }
    public void area(){
        int a = 5; int b =6;
        int c = a*b;
        System.out.println("Rectangle area is " + c);
        }
        public void cuboid(int d, int e, int f){
        int g = d*e*f;
                System.out.println("Result is " + g);
            }
    public void detail(String s, char a, int age, float b, String id) {
        System.out.println(s + " " + a + " and his age " + age);
        System.out.println("His height: " + b + " id: " + id);
    }
}
class Important {
        public static void main(String[] args) {
            Print mySquare = new Print();
            mySquare.square();
            //Print myArea = new Print();
            mySquare.area();
            //Print myCuboid = new Print();
            mySquare.cuboid(3,4,4);
           // Print myInfo = new Print();
            mySquare.detail("Shakthi",'k',35,168.25f,"school@gmail.com");
            mySquare.area1test();

      }
    }
