package Vathi;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class OTPGenerate {

    public static void main(String[] args) {
        String otpGen = generateOtp();
        System.out.println("Your OTP is "+ otpGen);

        String otpGen1 = generateOtps( 5);
        System.out.println("Your 5 digit OTP is "+ otpGen1);

        int otpSix = ThreadLocalRandom.current().nextInt(100000,999999);
        System.out.println("your 6 digit OTP is "+ otpSix);
    }

    private static String generateOtps(int otplength) {

        SplittableRandom splittableRandom = new SplittableRandom();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<otplength; i++){
            //  In SplitRandom 0 includes and 10 excludes
            sb.append(splittableRandom.nextInt(0,10));
        }
        return sb.toString();
    }

    private static String generateOtp() {
        int otpr = (int) (Math.random()*9000)+1000;
        String otp = String.valueOf(otpr);
        return  otp;
    }
}
