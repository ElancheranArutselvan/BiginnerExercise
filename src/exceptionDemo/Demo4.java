package exceptionDemo;

public class Demo4 {
    public static void main(String[] args) {
        int weight[] = null;
        int c=10, d=0;
        try{
            int f = c/d;
            System.out.println(weight[2]);
            System.out.println(f);
        }catch(NullPointerException|ArithmeticException e){
            System.err.println("There is no data");
            System.err.println("Arithmetic Exception has occur");
        }
        finally {
            int a,b;
            a=10; b=6;
            System.out.println(" No obstacle ,Just run");
            System.out.println("study less, listen more");
            System.out.println( a*b );
        }
    }

}
