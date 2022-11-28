package JavaExercises.Loop;

public class Amstrong {
    public static void main(String[] args)
    {
        int digit1, digit2, digit3;
        for(int ams = 1; ams <= 600; ams++)
        {
            int temp = ams;
            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

            if(Math.pow(digit1,3) + Math.pow(digit2,3)+ Math.pow(digit3,3) == ams)
            {
                System.out.println(ams);
            }
        }
    }
}
