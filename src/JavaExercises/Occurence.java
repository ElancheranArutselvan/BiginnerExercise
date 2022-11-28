package JavaExercises;

public class Occurence {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 2, 3, 1, 5, 3, 0, 8, 3, 9};
        int l = numbers.length;
        System.out.println("Integer Array length is : " + l);
        int i = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                System.out.println("\nindex position of duplicate :\n " + i);
            }

        }
        int c = 0, j, count = 0;
        while (c < numbers.length) {
            j = c + 1;
            while (j < numbers.length) {
                if (numbers[c] == numbers[j]) {
                    count++;
                    break;
                }
                j++;
            }
            c++;
        }
        System.out.println("\nTotal number of duplicates : " + count);
    }
}
//    }public static int findindex(int num[],int y){
//        if(num == null){
//            return -1;
//        }int legth= num.length;
//        int a=0;
//        while (a<legth){
//            if(num[a]==y){
//        return a;
//        }
