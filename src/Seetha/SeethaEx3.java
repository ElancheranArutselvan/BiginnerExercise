package Seetha;

import java.util.Scanner;

public class SeethaEx3 {
    public static void main(String[] args) {
        Scanner myDay = new Scanner(System.in);
        int x;
        System.out.println("Enter x");
        x = myDay.nextInt();
        int y=x%7;
        switch (y){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(" All day jolly day");
        }
    }

}

