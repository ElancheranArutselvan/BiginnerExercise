public class Mathmethod {
    static int getResult(int x){
            return x * x;
        } public static void main(String[] args) {
        for (int i = 5; i < 16; i += 5) {
            System.out.println("Square root of" + i + "is" + getResult(i));
        }
    }
}

