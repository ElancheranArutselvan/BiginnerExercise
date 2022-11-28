package JavaExercises.BasicArrayEx;
import java.util.Scanner;
public class FindKeyObj {
    public static void main(String[] args) {
        int i = 0, n, a, flag = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("No of Elements you want to Enter : ");
        n = inp.nextInt();
        int[] num = new int[n];
        System.out.println("Enter all the elements");
        for (i = 0; i < n; i++) {
            num[i] = inp.nextInt();
        }
        System.out.println("Enter the element you want to find : ");
        a=inp.nextInt();
        for( i=0;i<n;i++) {
            if (num[i] == a) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }}
            if (flag == 1) {
                System.out.println("Element find @)position :" + (i + 1));
            } else {
                System.out.println("Element not found");
            }


    }
}
