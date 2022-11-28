package Seetha.AccessModifier.MethodCall;
import java.lang.Class;
import java.lang.reflect.*;
public class CustomerAbc {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Welcome");
        Bank account = new Bank(0);
        account.deposit();
        account.interestRate();
        account.interestPay();
        Method m1=account.getClass().getDeclaredMethod("mangerSalary", int.class);
        m1.setAccessible(true);
        m1.invoke(account,1000000);


    }
}
