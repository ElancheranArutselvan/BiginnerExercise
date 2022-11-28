package JavaExercises.BasicArrayEx;

public class SumofArray {
    public static void main(String[] args) {
        int [] num ={20,50,55,63,75,82,80};
        int n=num.length;
        int sum =0,i=0;
        while (i<n){

            sum +=num[i];
            i++;
        }System.out.println(sum);

    }
}
