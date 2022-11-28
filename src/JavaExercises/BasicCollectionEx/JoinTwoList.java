package JavaExercises.BasicCollectionEx;

import java.util.ArrayList;

public class JoinTwoList {
    public static void main(String[] args) {
        ArrayList<String>player = new ArrayList<>();
        player.add("Sachin");
        player.add("Roger");
        player.add("Tigerwood");
        player.add("Ali");
        player.add("Viswanathan");
        System.out.println(player);
        ArrayList<String>sport = new ArrayList<>();
        sport.add("Cricket");
        sport.add("Tennis");
        sport.add("Golf");
        sport.add("Boxing");
        sport.add("Chess");
        System.out.println(sport);
        ArrayList<String>join = new ArrayList<>();
        join.addAll(player);
        join.addAll(sport);
        System.out.println(join);
    }
}
