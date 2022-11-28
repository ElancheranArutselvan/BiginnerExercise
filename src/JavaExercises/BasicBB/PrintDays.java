package JavaExercises.BasicBB;
import java.util.Scanner;
public class PrintDays {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a ;
        String [] Day = {"Sunday","Monday","Tuesday","Wednesday","Tuesday","Friday","Saturday"};
        System.out.println("Enter number :");
        a= num.nextInt();
        if((a<8)&&(a!=0)){
            switch (a){
                case 1:
                    System.out.println(Day[0]);break;
                case 2:
                    System.out.println(Day[1]);break;
                case 3:
                    System.out.println(Day[2]);break;
                case 4:
                    System.out.println(Day[3]);break;
                case 5:
                    System.out.println(Day[4]);break;
                case 6:
                    System.out.println(Day[5]);break;
                case 7:
                    System.out.println(Day[6]);break;
            }
            System.out.println("Have a joy");
        }else {
            System.out.println("Invalid. Please enter number between 1 to 7");
        }
    }
}
