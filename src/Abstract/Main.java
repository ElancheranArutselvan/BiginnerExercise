package Abstract;

abstract class Main{
    public abstract void study();
public String sports1 = "Cricket";
public String sports2 = "Football";
public String sports3 = "vollyball";
public int rank = 1;
}
class Sport extends  Main{
    public int olympic = 2022;
    public void study() {
        System.out.println("Playing all day");
    }

}
