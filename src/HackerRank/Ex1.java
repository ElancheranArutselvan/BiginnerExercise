package HackerRank;

import java.util.Formatter;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.io.*;
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  a,b,c;
        int x,y,z;
        System.out.println("Enter a ");
        a= sc.nextLine();
        System.out.println("Enter a ");
        b=sc.nextLine();
        System.out.println("Enter a ");
        c=sc.nextLine();
        String [] s = {a,b,c};
        System.out.println("Enter a ");
        x=sc.nextInt();

        System.out.println("Enter a ");
        y=sc.nextInt();
        System.out.println("Enter a ");
        z=sc.nextInt();
        Formatter formatter1=new Formatter();
        formatter1.format("%03d",y);
        Formatter formatter2=new Formatter();
        formatter2.format("%03d",z);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            if(i==0)
                System.out.println(s[i]+" "+x);
            if(i==1)
                System.out.println(s[i]+" "+formatter1);
            if(i==2)
                System.out.println(s[i]+" "+formatter2);
        }
//                System.out.println(sc.next()+" "+x);
        //Complete this line

        System.out.println("================================");

    }
    public static void threedigit(int[] l){
        int a=0,b=0,c=0;
        l = new int[]{a, b, c};
        for (int i=0;i<3;i++){
            System.out.printf("%03d",l);

        }
    }
}


