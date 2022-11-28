package inherPolyInner.inner;

public class Inner {
    int a =15;
    class Inner1 {
        int b = 10;
    }
}
class More{
    public static void main(String[] args) {
        Inner myData = new Inner();
        Inner.Inner1 myData1 = myData.new Inner1();
        System.out.println(myData.a + myData1.b);
    }



}