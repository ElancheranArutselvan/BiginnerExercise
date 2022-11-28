package AcceseMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BPrivateExample {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BPrivate bPrivate = new BPrivate();
        Method method = bPrivate.getClass().getDeclaredMethod("join", String.class, String.class, String.class);
        method.setAccessible(true);
        method.invoke(bPrivate,"Sachin","Cricket","India");
    }
}
