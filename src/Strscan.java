import java.util.Scanner;
public class Strscan {
    public static void main(String[] args) {
        Scanner myData = new Scanner(System.in);
        String alpha, name1, name2, txt, inp1, inp2;
        System.out.println("Enter Alpha");
        alpha = myData.nextLine();
        System.out.println("Alpha is:" + alpha);
        System.out.println("Alpha length is:" + alpha.length());
        System.out.println(alpha.toUpperCase());
        System.out.println(alpha.toLowerCase());
        System.out.println(alpha.indexOf("each"));
        System.out.println("Enter name1");
        name1 = myData.nextLine();
        System.out.println("Enter name2");
        name2 = myData.nextLine();
        System.out.println(name1.concat(name2));
        System.out.println("Enter txt");
        txt = myData.nextLine();
        System.out.println(txt.contains("moment"));
        System.out.println(txt.contains("true"));
        System.out.println("Enter inp1");
        inp1 = myData.nextLine();
        System.out.println("Enter inp2");
        inp2 = myData.nextLine();
        System.out.println(inp1.concat(inp2));
    }
}