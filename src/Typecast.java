public class Typecast {
    public static void main(String[] args) {
        int a =9;
        double b = a;
        int c=10;
        float d = c;
        float e = 11.156f;
        int f=(int)e;
        double g = e;
        double h = 60.2359848976543d;
        int i = (int)h;
        float j = (float)h;
        System.out.println("int 9 of double is: " + b);
        System.out.println(" int 10's float is: " + d);
        System.out.println("float 11.156's int is: " + f);
        System.out.println(" float 11.156's double is: " + g);
        System.out.println(" double 60.235984's int is: " + i);
        System.out.println("double 60.235984's float is: " + j);

    }
}
