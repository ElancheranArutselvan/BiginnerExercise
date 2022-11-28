package Modifier;

public class PrivateModif {
    private String name = "Sakthi";
    private int age = 25;
    private char initial = 'k';
    private double score = 60.23555558d;

    public static void main(String[] args) {
        PrivateModif myData = new PrivateModif();
        System.out.println("His name is " + myData.name +" "+ myData.initial);
        System.out.println("His age is " + myData.age + " and he scored " + myData.score);
    }

}
