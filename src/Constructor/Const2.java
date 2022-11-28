package Constructor;

public class Const2 {
    int a,b;
    public Const2(int c, int d){
        a = c+d;
        b = c*d;
    }
    public static void main(String[] args) {
        Const2 out = new Const2(6,7);
        System.out.println(out.a);
        System.out.println(out.b);
    }
}
