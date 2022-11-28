package Inheritance;

public class SportC extends SportA{

//    SportC(String _game1, String _player1, String _nation1) {
//        super(_game1, _player1, _nation1);
//    }

    public static void main(String[] args) {
        Sport sport=new Sport();
        SportA sportA = new SportA();
        sport.dataA("Cricket","Sachin");
        sport.dataB("Portugal","CR7");
        sportA.dataC("Tennis","Roger");
        sportA.dataD("Jamaica","Usain");
    }
}
