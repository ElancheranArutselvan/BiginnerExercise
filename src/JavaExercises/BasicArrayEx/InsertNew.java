package JavaExercises.BasicArrayEx;
import java.util.Arrays;
import java.util.Scanner;
public class InsertNew {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int [] sys = {45,5,67,90,67,9,34,4,66,27};
        for (int i = 0; i < sys.length; i++) {
            System.out.print(sys[i] + " ");
        }
        int ip,nv;
        System.out.println("Enter position ");
        ip=inp.nextInt();
        System.out.println("Enter value to insert ");
        nv = inp.nextInt();
        for (int j= sys.length-1;j>ip;j--){
            sys[j] =sys[j-1];
        }
        sys[ip]=nv;
        System.out.println("Array after insert : "+ Arrays.toString(sys));

    }
}
