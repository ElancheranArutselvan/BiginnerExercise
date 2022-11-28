package inherPolyInner;

public class Inheritance {
    protected String title = "Cinema";
    public void movie(){
        System.out.println("Action Movie list");
    }
}
class Commercial extends Inheritance {
    private String movieName = "Sammy";

    public static void main(String[] args) {
        Commercial list = new Commercial();
        list.movie();
        System.out.println(list.title + " name " + list.movieName);
    }
}
