package Seetha.AccessModifier.MethodCall;

public class Bank
{
    private int salary;
    Bank(int _salary){
        this.salary = _salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    void deposit(){
//        void : package level Access//
      System.out.println("Deposit amount Rs.10000");
    }
    public void interestRate(){
        System.out.println(" Interest rate is 4% for Agri loans");
    }
    protected double interestPay(){
        double amount = 10000/4.00;
        System.out.println("Interrest pay is : "+amount);
        return amount;
    }
    private int mangerSalary(int ab){

        System.out.println("Manager salary is : "+ab);
        return ab;
    }
    static void add(int a,int b){
        System.out.println(a+b);;
    }
}
