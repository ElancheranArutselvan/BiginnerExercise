package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> convertRomToInt = new HashMap();
        convertRomToInt.put('I', 1);
        convertRomToInt.put('V', 5);
        convertRomToInt.put('X', 10);
        convertRomToInt.put('L', 50);
        convertRomToInt.put('C', 100);
        convertRomToInt.put('D', 500);
        convertRomToInt.put('M', 1000);
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            number = number + (convertRomToInt.get(s.charAt(i)));
        }
        return number;
    }

    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter RomanNumber");


        String roman = inp.nextLine();

        RomanToInteger romanToInteger = new RomanToInteger();
        {
            romanToInteger.romanToInt(roman);
        }
    }
}
