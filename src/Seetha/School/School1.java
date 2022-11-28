package Seetha.School;

public class School1 {
    public static void main(String[] args) {
        Schoollist schoolA = new Schoollist("Laureal Hsc","State",3500);
        Schoollist schoolB = new Schoollist("DonBosco Hsc","CBSE",5000);
        System.out.println(schoolA.name);
        System.out.println(schoolB.student);
        schoolA.name ="Little Rose";
        schoolB.student= 4555;
        System.out.println(schoolA.name);
        System.out.println(schoolB.student);

    }
}
