package JavaExercises.BasicStringEx;

public class Reversestring {
public static void main(String args[]){
    String abs = "Hello, sir welcome to my house.";
        String def = new StringBuffer(abs).reverse().toString();
    System.out.println("Actual String is : "+abs);
    System.out.println(("After reverse : "+def));
    StringBuffer sb=new StringBuffer("Hello");
    sb.reverse();
    System.out.println(sb);
}
}
