package JavaExercises.Basic;
import java.util.*;
public class BasicEx7 {
    static int decitoBinary(int A){
        int binary[] = new int[100];
        int i=0;
        while (A>0) {
            binary[i++] = A % 2;
            A = A / 2;
        }
        for(int j = i-1; j>=0;j--){
            System.out.println(binary[j]);
        }
        return i;
    }


    public static void main(String[] args) {
        BasicEx7 obj = new BasicEx7();
        System.out.println("Binary Representation of 20 is " + decitoBinary(20));
        System.out.println("Binary Representation of 100 is : ");
        System.out.println(Integer.toBinaryString(100));
        System.out.println(Integer.toBinaryString(50));
        System.out.print("\nBinary Rep of 20 : ");
        System.out.println((Integer.toBinaryString(20)));
        Stack<Integer>stack = new Stack<Integer>();
        int B = 50;
        while(B!=0){
            int r= B%2;
            stack.push(r);
            B /= 2;}
        System.out.println("\n binary representation of 40 is:");
        while(!(stack.isEmpty())){
            System.out.println(stack.pop());
        }
        System.out.println();

    }
}
