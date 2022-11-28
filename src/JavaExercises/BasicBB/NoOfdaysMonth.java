package JavaExercises.BasicBB;
import java.util.Scanner;
public class NoOfdaysMonth {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int NoOfdays = 0, Year;
        String Month = "Invalid: Enter between 1 to 12";
        System.out.println("Enter Year : ");
        Year = data.nextInt();
        System.out.println("Enter Month number : ");
        int num = data.nextInt();
        if (num < 13) {
            switch (num) {
                case 1:
                    Month = "January";
                    NoOfdays = 31;
                    break;
                case 2:
                    Month = "February";
                    if (Year % 4 == 0) {
                        NoOfdays = 29;
                    } else {
                        NoOfdays = 28;
                    }
                    break;
                case 3:
                    Month = "March";
                    NoOfdays = 31;
                    break;
                case 4:
                    Month = "April";
                    NoOfdays = 30;
                    break;
                case 5:
                    Month = "May";
                    NoOfdays = 31;
                    break;
                case 6:
                    Month = "June";
                    NoOfdays = 30;
                    break;
                case 7:
                    Month = "July";
                    NoOfdays = 31;
                    break;
                case 8:
                    Month = "August";
                    NoOfdays = 31;
                    break;
                case 9:
                    Month = "September";
                    NoOfdays = 30;
                    break;
                case 10:
                    Month = "October";
                    NoOfdays = 31;
                    break;
                case 11:
                    Month = "November";
                    NoOfdays = 30;
                    break;
                case 12:
                    Month = "December";
                    NoOfdays = 31;
                    break;
            }
            System.out.println("In the year of " + Year + " , " + Month + " has " + NoOfdays);
        } else {
            System.out.println(Month);
        }
    }
}