package Seetha;

public class SeePrimeCheck {
    public static void main(String[] args) {
        int n=17;
        int num = 1;
        int count =0;
        while (count<n) {
            num++;
            int i;
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (num == i) {
                count++;
            }

        }

        System.out.println(num);
    }

}
