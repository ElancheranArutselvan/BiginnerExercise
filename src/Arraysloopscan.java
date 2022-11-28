import java.util.Scanner;
public class Arraysloopscan {
    public static void main(String[] args) {
        Scanner myInfo  = new Scanner(System.in);
        String w, x, y, z;
        System.out.println("Enter w");
        w = myInfo.nextLine();
        System.out.println("Enter x");
        x = myInfo.nextLine();
        System.out.println("Enter y");
        y = myInfo.nextLine();
        System.out.println("Enter z");
        z = myInfo.nextLine();
        String[] colours = {w, x, y, z};
        for(int i = 0; i< colours.length; i++){
            System.out.println(colours[i]);
        }for(String i : colours){
            System.out.println(i);
        }

    }
}