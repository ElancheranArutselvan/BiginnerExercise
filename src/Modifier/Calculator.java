package Modifier;

public class Calculator {
    private int number1;
    private int number2;

    Calculator(int _number1,int _number2){
        this.number1=_number1;
        this.number2=_number2;
    }public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public void add(){
        System.out.println(number1+number2);
    } public void substract(int number1,int number2){
        System.out.println(number1-number2);
    }
    public void multiply(int number1,int number2){
        System.out.println(number1*number2);
    }
    public void division(int number1,int number2){
        double n3=number1/number2;
        System.out.println(n3);
    }
}
