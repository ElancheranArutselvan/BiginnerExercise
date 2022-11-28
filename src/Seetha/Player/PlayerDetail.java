package Seetha.Player;


import javax.management.StringValueExp;

public class PlayerDetail {
    public static void main(String[] args) {
        Players player1=new Players("Sachin","Cricket", 7,1500000.586d);
        Players player2=new Players("CR7","Soccer",1,2000090.589d);
        Players player3=new Players("Roger","Tennis",5,18506750.987d);

        System.out.println(player1.getSport());
        System.out.println(player2.getName());
        System.out.println(player3.getIncome());
        player2.setName("Messi");
        player3.setIncome(210000000.567d);
        System.out.println(player1.getSport());
        System.out.println(player2.getName());
        System.out.println(player3.getIncome());

    }
}
