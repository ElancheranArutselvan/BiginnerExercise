package Constructor;

public class Const3 {
    String name;
    char initial;
    int age;
    float height;
    public Const3( String id, char i, int a, float b){
        name = id;
        initial = i;
        age = a;
        height = b;
    }

    public static void main(String[] args) {
        Const3 data = new Const3("Thamizh",'A',35, 160.35f);
        System.out.println(data.initial + "." + data.name + " age is " + data.age  + " and height is " + data.height);
    }
}
