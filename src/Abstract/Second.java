package Abstract;

import Abstract.Sport;
import Abstract.Game;


class Second{
    public static void main(String[] args) {
        Sport myInp = new Sport();
        Game myInb  = new Game();
        System.out.println("Sport1 is :" + myInp.sports1);
        System.out.println("Sport2 is :" + myInp.sports2);
        System.out.println("Sport3 is :" + myInp.sports3);
        System.out.println("My rank is :" + myInp.rank);
        System.out.println("Recent Olympic year :" + myInp.olympic);
        myInp.study();
        System.out.println("My Favourite game : " + myInb.game1);
        myInb.study();


    }
}