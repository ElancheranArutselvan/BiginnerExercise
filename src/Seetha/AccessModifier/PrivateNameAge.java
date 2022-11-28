package Seetha.AccessModifier;

public class PrivateNameAge {
    public static void main(String[] args) {
        PrivateEx2 player1 = new PrivateEx2("sAS","PIG", 56);
        System.out.println(player1.getNameB());
        player1.setNameB("kholi");
        System.out.println(player1.getNameB());
    }
}
