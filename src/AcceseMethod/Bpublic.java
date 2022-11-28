package AcceseMethod;

public class Bpublic {
    public String name;
    public void display(String name){
        System.out.println(name);
    }
    static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Bpublic obj = new Bpublic();
        System.out.println(obj.add(5,6));
    }
}
