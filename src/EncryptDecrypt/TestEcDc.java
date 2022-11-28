package EncryptDecrypt;

public class TestEcDc {
    public static void main(String[] args) {
        StringEncrpt se = new StringEncrpt();
        se.getInput();
        System.out.printf("Encrypted String is: \n %s ", se.encrypt());
        se = null;
    }
}
