package JavaExercises.Basic;
import java.util.*;

public class BasicEx20 {
    public static void main(String[] args) {
        int n=0,a =0,b=1;
        while (n<100){
            a++;
            if(a%2 ==1) {
                if(is_Prime(a)){
                b += n;
                n++;
            }
            }
            System.out.println("sum of prime numbers is "+b);
            }

    }public static boolean is_Prime(int a){
        for(int i=3;i<a;i++){
            if(a%i == 0){
                return false;
            }
        }return true;
    }
    }