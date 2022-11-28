package JavaExercises.Basic;

public class BasicEx12 {


        public static void count (String check){
            char[] ch = check.toCharArray();
            int letter = 0;
            int space = 0;
            int numbers = 0;
            int otherchar = 0;
            for (int i = 0; i < check.length(); i++) {
                if (Character.isAlphabetic(ch[i])) {
                    letter++;
                } else if (Character.isDigit(ch[i])) {
                    numbers++;
                } else if (Character.isSpaceChar(ch[i])) {
                    space++;
                } else {
                    otherchar++;
                }
            }

            System.out.println("The sentence is : abcd@7960&>>gmail.com..Stalinjaya4 karunanithi4 kamaraj ");
            System.out.println("letter is : " + letter);
            System.out.println("space is : " + space);
            System.out.println("numbers is : " + numbers);
            System.out.println("otherchar is : " + otherchar);
        }public static void main(String[] args) {
        String check = "abcd@7960&>>gmail.com..Stalinjaya4 karunanithi4 kamaraj";
        count(check);

    }
}














































































































