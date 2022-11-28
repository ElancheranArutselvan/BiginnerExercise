package Seetha.AccessModifier;

public class ProtectedSchool {
    public static void main(String[] args) {
        ProtectedEx obj = new ProtectedEx();
        System.out.println(obj.school);
        obj.school="DonBosco";
        System.out.println(obj.school);

    }
}