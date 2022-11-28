package Seetha.ClassObjectInheritance;

abstract class Department {
    private String greet = "Welcome to world of BMW";
    public String getGreet() {
        return greet;
    }

    public void setGreet(String greet) {
        this.greet = greet;
    }

    public abstract void departmentName();
}
class Manager extends Department{
    public String mangerName ="Stephen Edwarg";

    public void departmentName() {
        System.out.println("Designing");
    }

}
class AsstManager extends Manager implements Employee{
    public void employeeId() {
        System.out.println("Employee Id : BMW4567");
    }

    public void jointYear() {
        System.out.println("Joint in the year of : 2000");

    }

    public void age() {
        System.out.println("His age is : 45");
    }

    public void salary() {
        System.out.println("Salary : 300000 per Year");

    }

    public static void main(String[] args) {
        AsstManager asstManager = new AsstManager();
        asstManager.employeeId();
        asstManager.jointYear();
        asstManager.age();
        asstManager.salary();
        System.out.println("manager name is : "+asstManager.mangerName);
        asstManager.departmentName();
        System.out.println(asstManager.getGreet());
        asstManager.employeeName("Rajkumar");
        System.out.println("Id : "+Employee.id+" and year of joining : "+Employee.year);
        Price price=new Price();
        price.carPrice(1000000);
//        Manager manager = new Manager();
//        System.out.println(manager.getGreet());
//        manager.departmentName();
//        System.out.println("Manager Name : "+manager.mangerName);
    }
}

