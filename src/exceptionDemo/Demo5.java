package exceptionDemo;
import java.io.*;

public class Demo5 {public static <Page> void main(String[] args) {
    int weight[] = null;
    int c=10, d=0;
    try{
        int f = c/d;
        System.out.println(weight[2]);
        System.out.println(f);
    }catch(NullPointerException e){
        System.err.println("There is no data");

    }catch(ArithmeticException e){
        System.out.println("Arithmetic Exception has occur");
    }
//
//    File page = new File("Velpaari");
//    try {
//        FileInputStream pg = new FileInputStream(page);
//    }catch (FileNotFoundException e){
//        e.printStackTrace();
//    }
    finally {
        int a,b;
        a=10; b=6;
        System.out.println(" No obstacle ,Just run");
        System.out.println("study less, listen more");
        System.out.println( a*b );
    }
}}


