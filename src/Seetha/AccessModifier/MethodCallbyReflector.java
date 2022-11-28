package Seetha.AccessModifier;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.*;
public class MethodCallbyReflector {
    PrivateEx privateEx;

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException,IllegalAccessException,IllegalArgumentException, InvocationTargetException,InstantiationException {

        Class<PrivateEx> c = (Class<PrivateEx>) Class.forName("Seetha.AccessModifier.PrivateEx");

        Object op = c.newInstance();
        Method m = c.getDeclaredMethod("Display", String.class);
        m.setAccessible(true);
        op = m.invoke(new PrivateEx(), null);
        String result =(String)op;
        System.out.println(result);
    }
}
