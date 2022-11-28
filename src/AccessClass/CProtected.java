package AccessClass;

public class CProtected {
    protected class Sprinter{
       void show(){
            System.out.println("Usain");
        }
    }
    void displayA(){
        Sprinter sprinter=new Sprinter();
        sprinter.show();
    }

    public static void main(String[] args) {
      CProtected cProtected=new CProtected();
      cProtected.displayA();
    }
}
