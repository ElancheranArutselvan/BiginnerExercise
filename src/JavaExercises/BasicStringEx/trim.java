package JavaExercises.BasicStringEx;

public class trim {
    public static void main(String[] args) {
        String  def = "      Saurav    is aggressive and   adamant   Cricketer. But he is a pioneer         " ;
        String ghi = def.trim();
        System.out.println("Actual is : "+def);
        System.out.println("After Trim : "+ghi);
        System.out.println("After trim : "+def.trim());
    }
}
