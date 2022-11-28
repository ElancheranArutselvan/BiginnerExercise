package Seetha.AccessModifier;

public class PrivateEx {
    private String nameA = "CR7";
    private String nameB = "Tigerwood";
    private String sportA= "Soccer";
    private String sportB = "Golf";
    private int ageA = 48;
    private int ageB = 42;

    public static void main(String[] args) {
        PrivateEx info = new PrivateEx();
        System.out.println((info.nameA+" "+info.sportA+" "+info.ageB));
    }
    private void display(){
        System.out.println(" Have a nice journey");
    }
    }


