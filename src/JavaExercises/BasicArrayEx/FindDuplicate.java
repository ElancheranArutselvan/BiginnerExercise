package JavaExercises.BasicArrayEx;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] sys = {45, 5, 76, 6, 90, 67, 9, 45, 34, 4, 66, 27, 5};
        for (int i = 0; i < sys.length; i++) {
            System.out.print(sys[i] + " ");
        }
        for (int j = 0; j < sys.length - 1; j++) {
            for (int k = j + 1; k < sys.length; k++) {
                if (sys[j] == sys[k] && j != k) {
                    System.out.print("\nDuplicate element is :"+sys[k]);
                }
            }
        }
    }
}