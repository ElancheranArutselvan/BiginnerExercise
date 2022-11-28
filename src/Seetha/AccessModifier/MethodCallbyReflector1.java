package Seetha.AccessModifier;
import java.lang.Class;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.*;

public class MethodCallbyReflector1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        PrivateEx privateEx = new PrivateEx();
        Method method= privateEx.getClass().getDeclaredMethod("display",null);
        method.setAccessible(true);
        method.invoke(privateEx,null);

    }

}