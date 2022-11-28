import java.util.Scanner;
public class Breakcontinuescan {
    public static void main(String[] args) {
        Scanner myData = new Scanner(System.in);
        int num, count;
        System.out.println("Enter num");
        num = myData.nextInt();
        for(int b = 0; b<num; b++){
            if(b==4){
                continue;
            }
            System.out.println(b);
        }
        for(int c = 0; c<num; c++){
            if(c==4){
                break;
            }
            System.out.println(c);
        }
        System.out.println("Enter count");
        count = myData.nextInt();
        int a = 0;
        while (a<count){
            System.out.println(a);
            a += 10;
            if(a==70) {
                continue;
            }
        }
        int d = 0;
        while (d<count){
            System.out.println(d);
            d += 10;
            if(d==70) {
                break;
            }
        }
    }
}