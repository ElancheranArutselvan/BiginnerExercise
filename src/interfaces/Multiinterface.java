package interfaces;

interface MultiInterface {
    public void mySubject();
}
interface MultiInterface1{
    public void mySport();
}
interface MultiInterface2 {
    public void myfood();
}
class JustPrint implements MultiInterface,MultiInterface1,MultiInterface2{
    public void mySubject() {
        System.out.println("My Subject is math");
    }
    public void mySport() {
        System.out.println("My Sport is Kabadi");
    }
    public void myfood() {
        System.out.println("My food is Rice");
    }
}
class Out {
    public static void main(String[] args) {
        JustPrint myPrint = new JustPrint();
        myPrint.mySubject();
        myPrint.mySport();
        myPrint.myfood();
    }

}