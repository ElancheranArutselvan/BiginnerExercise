package Seetha.ClassObjectInheritance;

interface BMWOrg {
public  int year = 2001;
public  String id = "BMW1234";


    public void employeeId();
    public  void jointYear();

}
class Price implements BMWOrg{

    private int cost;
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public void carPrice(int _cost){
        System.out.println("Price car is : "+_cost);
    }
    public void employeeId() {
        System.out.println("Employee Id BMW1000");
    }
    public void jointYear() {
        System.out.println("joint year is 2010");
    }
}
interface Employee extends BMWOrg{

    static String name = null;
    public void age();
    public void salary();

    default void employeeName(String _name){
        System.out.println(_name);
    }
}
