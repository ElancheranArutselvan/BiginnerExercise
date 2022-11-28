package AcceseMethod;

public class ProtectedOverridden {
    protected void note() {
        System.out.println(" Say hai");
    }
    protected void msg(){
        System.out.println("Playing football");
    }
}
class Abc extends ProtectedOverridden{
        protected void note(){
            System.out.println("Overridden");
        }
        public void msg(){
            System.out.println("Welcome");
        }

    public static void main(String[] args) {
       ProtectedOverridden protectedOverridden = new ProtectedOverridden();
        Abc abc =new Abc();
        protectedOverridden.note();
        abc.note();
        abc.msg();
    }

}
