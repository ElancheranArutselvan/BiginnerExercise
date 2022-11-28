import java.util.Scanner;
public class Mathmethods {
    public static void main(String[] args) {
        Scanner myInfo = new Scanner(System.in);
        int a1;
        System.out.println("Enter value a1");
        a1 = myInfo.nextInt();
        for (int i = 5; i < a1; i += 5) {
            System.out.println("Square root of " + i + "is" + getOutput(i));
        }
    }

    static int getOutput(int x){
        return x * x;
    }
}

