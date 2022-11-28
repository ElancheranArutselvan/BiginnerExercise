package JavaExercises;
import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        Scanner Days = new Scanner(System.in);
        String day;
        System.out.println("Enter Day of the week : ");
        day = Days.nextLine();
            switch (day) {
                case "Sunday":
                    day.equals("Sunday");
                    System.out.println(1);
                    break;
                case "Monday":
                    day.equals("Monday");
                    System.out.println(2);
                    break;
                case "Tuesday":
                    day.equals("Tuesday");
                    System.out.println(3);
                    break;
                case "Wednesday":
                    day.equals("Wednesday");
                    System.out.println(4);
                    break;
                case "Thursday":
                    day.equals("Thursday");
                    System.out.println(5);
                    break;
                case "Friday":
                    day.equals("Friday");
                    System.out.println(6);
                    break;
                case "Saturday":
                    day.equals("Saturday");
                    System.out.println(7);
                    break;
                default:
                    System.out.println("Invalid. enter valid day");
            }
    }
}

