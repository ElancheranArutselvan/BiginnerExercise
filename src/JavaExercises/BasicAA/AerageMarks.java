package JavaExercises.BasicAA;
public class AerageMarks {
    public static void main(String[] args) {
        int [] marks = {56,50,68,90,75,49};
        int m=6; double Average = 0;
        for(int i=0;i<m;i++){
            Average += marks[i];
        }
        System.out.println("Average of marks : " + Average/m);
    }
}
