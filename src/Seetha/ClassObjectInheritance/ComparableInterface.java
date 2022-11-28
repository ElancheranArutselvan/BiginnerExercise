package Seetha.ClassObjectInheritance;

class ComparableInterface implements Comparable<ComparableInterface> {
    private String name;
    private int age;
    public ComparableInterface(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }
    public String toString() {
        return "";
    }
    public int compareTo(ComparableInterface per) {
        if(this.age == per.age)
            return 0;
        else
            return this.age > per.age ? 1 : -1;
    }
}
class Main{
    public static void main(String[] args) {
        //declare two objects of Person class
        ComparableInterface p1 = new ComparableInterface("Adrian", 26);
        ComparableInterface p2 = new ComparableInterface("Eddie", 26);
        int ageDiff = p1.compareTo(p2);     //compare ages of two persons declared
        switch(ageDiff) {
            case -1: {
                System.out.println(p2.getName() + " is older than " + p1.getName());
                break;
            }
            case 1: {
                System.out.println(p1.getName() + " is older than " + p2.getName());
                break;
            }
            default:
                System.out.println(p1.getName () + " and " + p2.getName ()
                        + " are of the same age!");
        }
    }
}

