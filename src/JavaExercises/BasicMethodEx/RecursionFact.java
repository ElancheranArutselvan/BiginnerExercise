package JavaExercises.BasicMethodEx;

public class RecursionFact {
    public static void main(String[] args) {
        int result= fact(6);
        System.out.println("Factorial of 6 is : "+result);
    }

    public static int fact(int j) {
        if(j==0) {
            return 1;
        }else{
            return j*fact(j-1);
        }
    }
}
