package exceptionDemo;

public class Demo2 {
    public static void main(String[] args) {
        int weight[] = null;
       try{
           System.out.println(weight[2]);
       }catch(NullPointerException e){
           System.err.println("There is no data");

        }finally {
           int a,b;
           a=10; b=6;
           System.out.println(" No obstacle ,Just run");
           System.out.println("study less, listen more");
           System.out.println( a*b );
       }

    }
}
