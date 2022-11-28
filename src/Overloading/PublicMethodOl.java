package Overloading;

public class PublicMethodOl {
    public int sum(int x, int y) {
        return (x + y);
    }
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }
    public double sum(double x, double y)
    {
        return (x + y);
    }
    public String sum(String x,String y){
        return (x+y);
    }
    public boolean sum(String x, int y){
//        System.out.println(x+y);
        return false;
    }
    public void sum(String a,String b,String c){
        System.out.println(a+b+c);
    }
    public void sum(String x, int y,int z){
        System.out.println(x+y+z);
    }
    void sum( int x,String y, int z){
        System.out.println(x+y+z);
    }
    private static int sum(int x,int y,int z,int w){
        return x+y+z+w;
    }
    private void sum(int x,int y,String z){
        System.out.println(x+y+z);
    }
    protected void sum(String x,int y,String z){
        System.out.println(x+y+z);

    }
    protected String sum(String x){
        return x;
    }

    public static void main(String args[])
    {
        PublicMethodOl publicMethodOl = new PublicMethodOl();
        System.out.println(publicMethodOl.sum(10, 20));
        System.out.println(publicMethodOl.sum(20, 10, 30));
        System.out.println(publicMethodOl.sum(10.5, 20.5));
        System.out.println(publicMethodOl.sum("Captain"," Prabhakaran"));
        System.out.println(publicMethodOl.sum("Chicken ",65));
        publicMethodOl.sum("Captain"," Velupillai ","Prabhakaran");
        publicMethodOl.sum("Tollfree ",100,108);
        publicMethodOl.sum(450," greater than ",250);
        System.out.println(publicMethodOl.sum(5,6,7,8));
        publicMethodOl.sum(100,108,"Print");
        publicMethodOl.sum("Called ",100," times");
        System.out.println(publicMethodOl.sum("Welcome"));
    }
}
