package AcceseMethod;

public class BPrivate1 {String sport;
    public String player;
    private String country;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public void join1(String _player,String _sport,String _country){

       join(_player,_sport,_country);
    }
    private void join(String player,String sport,String nation){
        System.out.println(player+" playing "+sport+" from "+nation);
    }
}
