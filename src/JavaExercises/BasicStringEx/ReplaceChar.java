package JavaExercises.BasicStringEx;

public class ReplaceChar {
    public static void main(String[] args) {
        String abc = "Sachin is Greatest of all time Legentary cricketer ";
        String  def = " Saurav is aggressive and adamant Cricketer. But he is a pioneer ";
        System.out.println("Actual is :"+abc);
        System.out.println("After replaced a=G : "+abc.replace('a','G'));
        String ghi = def.replace('e','T');
        System.out.println("Actual is : "+def);
        System.out.println("After replace e =T : "+ghi);
    }
}
