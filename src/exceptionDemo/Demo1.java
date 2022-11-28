package exceptionDemo;

public class Demo1 {
    public static void main(String[] args) {
        int[] age = {5,10,15,20,25};
            System.out.println(age[0]);
        System.out.println(age[3]);
        try{
        System.out.println(age[5]);
        } catch (Exception e) {
            System.out.println("Error found");
        }
        System.out.println(" Always think ");
    }
}
