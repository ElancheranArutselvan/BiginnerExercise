public class Method {
    static int add(int x, int y,int z){
        int a = x+y+z;
        return a;
    }
    static int subtract(int e, int b, int c) {
        int d = e - b - c;
        return d;
    }
    static int multiply(int f, int g, int h) {
        int i = f*g*h;
        return i;
    }static int division(int j, int k) {
        int l = j/k;
        return l;
    }static int modulo(int m, int n) {
        int o = m%n;
        return o;
    }static void asItis(String name, int age) {
        System.out.println(name + " is " + age);
    }public static void main(String[] args) {
        System.out.println("Result is " + add(5,6,7));
        System.out.println("Result is " + subtract(50,15, 10));
        System.out.println("Result is " + multiply(5,6,2));
        System.out.println("Result is " + division(55,5));
        System.out.println("Result is " + modulo(5,2));
        asItis("Siva",20);
    }

}