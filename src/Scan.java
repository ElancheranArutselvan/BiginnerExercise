import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = myObj.nextLine();
        System.out.println("username is:" + userName);
        System.out.println("DOB");
        double dob = myObj.nextDouble();
        System.out.println("DOB is:" + dob);
        System.out.println("Experience yrs");
        int experienceInYrs = myObj.nextInt();
        System.out.println("Experience yrs is:" + experienceInYrs);
        }
    }
