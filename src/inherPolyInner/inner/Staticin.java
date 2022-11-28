package inherPolyInner.inner;

public class Staticin {
    int d =5;
    int e = 10;

    static class Inside{
        int f = 15;
    }

}
class Main {
    public static void main(String[] args) {
        Staticin.Inside myInside = new Staticin. Inside();
        System.out.println(myInside.f);
    }
}