import java.util.Scanner;
public class Arraysbrkctescan {
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
            if(i==1){
                continue;
            }
            System.out.println(colours[i]);
        }for(int i = 0; i< colours.length; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(colours[i]);
        }
        for(String i : colours){
            System.out.println(i);
        }
        int j=0;
        for(String obj: colours){
            if(obj.equals("aa")){
                continue;
            }
            System.out.println(obj);
            j++;
        }
    }
}