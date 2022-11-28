package JavaExercises.BasicBB;
import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        float first,Mid,Final,Average;
        System.out.println("Enter your first Term Score : ");
        first= score.nextFloat();
        System.out.println("Enter your mid Term Score : ");
        Mid= score.nextFloat();
        System.out.println("Enter your final Term Score : ");
        Final= score.nextFloat();
        Average=(first+Mid+Final)/3;
        System.out.println("Average Sore is : "+Average);
        if(Average>=90) {
            System.out.println("Congratulations.Your grade is A ");
        } else if ((90>Average)&&(Average>=70)){
            System.out.println("Good ... Your grade is B ");
        } else if ((70>Average)&&(Average>=50)) {
            System.out.println("Better ... Your grade is C");
        }else {
            System.out.println("Your grade is F");
        }
    }

    }

