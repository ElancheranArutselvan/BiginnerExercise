package JavaExercises.Loop;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        int num;
        System.out.println("Enter Number : ");
        num = info.nextInt();
        boolean flag = true;
        for(int i=2;i<num;i++){
            if(num%i==0) {
                flag = false;
                break;
            }
        }if(flag&&num>1){
            System.out.println(num+" is Prime number");
        }else{
            System.out.println(num+" is not Prime");
        }
    }
}
