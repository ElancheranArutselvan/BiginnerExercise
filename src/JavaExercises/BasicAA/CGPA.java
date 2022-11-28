package JavaExercises.BasicAA;

public class CGPA {
    public static void main(String[] args) {
        int n=5,i=0,sum=0;
        double percentage,cgpa;
        int [] marks = {60,50,70,80,90};
        for(i=0;i<n;i++){
            sum += marks[i];
        }
        percentage = sum/500f;
         cgpa = percentage*9.5;
        System.out.println("CGPA is = "+ cgpa);

    }
}
