package Seetha.AccessModifier;

public class PrivateMethodpayilagam {
    public static void main(String[] args) {
        PrivateMethodpayilagam maths = new PrivateMethodpayilagam();
        int totalmarks = maths.add();
        double aggregate = maths.percentage(totalmarks);
        int abc = maths.multiply(totalmarks);
        System.out.println("Product is "+abc);

    }
    private int add(){
        int tamil =70,English = 56, math=95;
        int total = tamil+English+math;
        System.out.println("total is : "+total);
        return total;
    }
    private double percentage(double input){
        double percentag =(input/300)*100;
        System.out.println(percentag);
        return percentag;
    }
    private int multiply(int number){
        int product = number*3;
        return product;
    }
}
