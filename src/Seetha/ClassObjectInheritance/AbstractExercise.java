package Seetha.ClassObjectInheritance;

abstract class AbstractExercise {

    private String k = "Have a great Journey";
    protected String l = "Wordpower";
    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }
    public abstract void method();

}
class AbstractExA extends AbstractExercise{

    private String m = "Just Talk";
    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public void method() {
        System.out.println(" Enjoy the Party ");

    }
}
class AbstractExB extends AbstractExercise{
    private String n="Playing sport";
    public void method(){
        System.out.println("Today's match ");
    }

    public static void main(String[] args) {
        AbstractExercise abstractExercise= new AbstractExercise() {
            @Override
            public void method() {

            }
        };
        AbstractExA abstractExA = new AbstractExA();
        AbstractExB abstractExB = new AbstractExB();
        abstractExercise.method();
        abstractExA.method();
        abstractExB.method();
        System.out.println(abstractExA.getK()+" "+abstractExB.n);
        System.out.println(abstractExB.getK()+" "+abstractExA.getM());
        System.out.println(abstractExercise.getK()+" "+abstractExercise.l);
        }
    }

