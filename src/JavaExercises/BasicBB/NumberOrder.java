package JavaExercises.BasicBB;

import java.math.BigInteger;

public class NumberOrder {
    public static void main(String[] args) {

        BigInteger operand1 = new BigInteger("123454466666666666666665454545454454544598989899545455454222222222222222");
        BigInteger operand2 = new BigInteger("123454466666666666666665454545454454544598989899545455454222222222222222");
        System.out.println(operand1.add(operand2));
        System.out.println(operand1.subtract(operand2));
        System.out.println(operand1.multiply(operand2));
        System.out.println(operand1.divide(operand2));
    }
}