package AcceseMethod;

public class BPrivate {
    String sport;
    public String player;
    private String country;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    private void join(String player,String sport,String nation){
        System.out.println(player+" playing "+sport+" from "+nation);
    }
}
