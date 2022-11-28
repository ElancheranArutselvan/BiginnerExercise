package Inheritance;

public class SportA extends Sport{
    private String game1;
    private String player1;
    private String nation1;
    SportA(String _game1, String _player1, String _nation1){
        super();
        this.game1=_game1;
        this.nation1=_nation1;
        this.player1=_player1;
    }

    public SportA() {

    }

    public String getGame1() {
        return game1;
    }

    public void setGame1(String game1) {
        this.game1 = game1;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getNation1() {
        return nation1;
    }

    public void setNation1(String nation1) {
        this.nation1 = nation1;
    }
    public void dataC(String game1,String player1){
        data3(game1,player1);
    }
    public void dataD(String nation1,String player1){
        data4(nation1,player1);
    }
    private void data3(String game1,String player1){
        System.out.println(player1+" plays "+game1);
    }
    private void data4(String nation1,String player1){
        System.out.println(player1+" from "+nation1);
    }

}
