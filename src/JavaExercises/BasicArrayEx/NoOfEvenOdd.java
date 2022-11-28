package JavaExercises.BasicArrayEx;

public class NoOfEvenOdd {
    public static void main(String[] args) {
        int[] sys = {45, 5, 76, 6, 90, 67, 9, 45, 34, 4, 66, 27, 5};
        for (int i = 0; i < sys.length; i++) {
            System.out.print(sys[i] + " ");
        }
        int even =0;
        for (int j = 0; j < sys.length; j++){
            if(sys[j]%2==0){
                even++;
            }

        }System.out.println("\nNo of even Numbers : "+even);
        System.out.println("\nNo of Add numbers : "+(sys.length-even));
        System.out.println("\n Even numbers : ");
        for (int k = 0; k < sys.length; k++) {
            if (sys[k] % 2 == 0)
                System.out.print(sys[k]+",");
            }
        System.out.println("\n Odd numbers : ");
        for (int k = 0; k < sys.length; k++) {
            if (sys[k] % 2 != 0)
                System.out.print(sys[k]+",");
        }


        }
}
