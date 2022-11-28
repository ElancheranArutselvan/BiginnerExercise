package Overloading;

public class PublicVoid {
    public void add(String x,String y){
        System.out.println(x+y);
    }
    public void add(int x,String y){
        System.out.println(x+y);
    }
    static int add(int x,int y){
        return x+y;
    }
    private String add(String x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        PublicVoid publicVoid=new PublicVoid();
        publicVoid.add("Fried"," Rice");
        publicVoid.add(100," Pippers");
        System.out.println(publicVoid.add(45,55));
        System.out.println(publicVoid.add("ABD ",360));

    }
}
