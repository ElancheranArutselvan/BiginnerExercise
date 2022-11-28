package Overridding;

public class PrivateMethodInner {
    private void table(){
        System.out.println("Ita a non veg table");
    }
    class PrivateInner{
        private void table(){
            System.out.println("Its a veg Table");
        }
    }

    public static void main(String[] args) {
        PrivateMethodInner privateMethodInner = new PrivateMethodInner();
        privateMethodInner.table();
        PrivateMethodInner.PrivateInner privateInner = privateMethodInner.new PrivateInner();
        privateInner.table();


    }
}
