package Inheritance;

public class Sport {
    private String game;
    private String player;
    private String nation;
    Sport(String _game, String _player, String _nation){
        this.game=_game;
        this.nation=_nation;
        this.player=_player;
    }

    public Sport() {

    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    public void dataA(String game,String player){
        data1(game,player);
    }
    public void dataB(String nation,String player){
        data2(nation,player);
    }
    private void data1(String game,String player){
        System.out.println(player+" plays "+game);
    }
    private void data2(String nation,String player){
        System.out.println(player+" from "+nation);
    }
}
