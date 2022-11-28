package Modifier;

public class Output {
    public static void main(String[] args) {
        Calculator inp1 =new Calculator(45,65);
        System.out.println(inp1.getNumber2());
        inp1.add();
        inp1.substract(65,75);
        inp1.multiply(56,2);
        inp1.division(56,3);
    }
}
