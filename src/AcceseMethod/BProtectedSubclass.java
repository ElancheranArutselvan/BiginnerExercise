package AcceseMethod;

public class BProtectedSubclass {

    protected String colour;
    protected String rice;
    protected String fruit;

class Trace extends BProtectedSubclass{

    protected String ask(String colour, String rice, String fruit){
        return (fruit+colour+rice);
    }
}
}
