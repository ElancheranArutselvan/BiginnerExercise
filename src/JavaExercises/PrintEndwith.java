package JavaExercises;

public class PrintEndwith {
    public static void main(String[] args) {
        int i = 0;
        String[] names = {"Elaa", "Ram", "Ranjith", "Geetha", "Dhana", "Sathis"};
        int n = names.length;
        System.out.println("String lenght is : " + n);
        while (i < n) {
            if (names[i].charAt(0) == 'R') {
                System.out.println(names[i]);
            }
            i++;

        }
        int j = 0;

        while (j < n) {
            char lastchar = names[j].charAt(names[j].length() - 1);

            if (lastchar == 'a') {
                System.out.println("\n"+names[j]);

            }
            j++;
        }
    }
}