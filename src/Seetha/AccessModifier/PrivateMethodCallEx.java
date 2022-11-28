package Seetha.AccessModifier;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class PrivateMethodCallEx {
    public void CreateObject(String truck,int wheels)throws NoSuchMethodException,InstantiationException,IllegalAccessException,IllegalArgumentException, InvocationTargetException
    {
        Constructor<PrivateMethodCall> vehicle = PrivateMethodCall.class.getDeclaredConstructor();
        vehicle.setAccessible(true);
        Object obj = vehicle.newInstance();
        if (obj instanceof PrivateMethodCall) {
            PrivateMethodCall ip = (PrivateMethodCall) obj;
            ip.setTruck(truck);
            ip.setWheels(wheels);
            System.out.println(ip.getTruck()+" has "+ip.getWheels()+" wheels");
        }
    }
    public void createObjectByConstructorname(String truck,int wheels)throws NoSuchMethodException,InstantiationException,IllegalAccessException,IllegalArgumentException, InvocationTargetException
    {
Constructor<PrivateMethodCall>vehicle = PrivateMethodCall.class.getDeclaredConstructor(String.class,Integer.class);
if(Modifier.isPrivate(vehicle.getModifiers())){
    vehicle.setAccessible(true);
    Object obj = vehicle.newInstance(truck,wheels);
    if(obj instanceof PrivateMethodCall){
        PrivateMethodCall ip = (PrivateMethodCall) obj;
        System.out.println(" This "+ip.getTruck()+" truck has "+wheels+" wheels");
    }
}
    }

    public static void main(String[] args)throws NoSuchMethodException,IllegalArgumentException,InstantiationException,InvocationTargetException,IllegalAccessException,SecurityException
    {
        PrivateMethodCallEx input = new PrivateMethodCallEx();
        input.CreateObject("Tailer",36);
        System.out.println("--------------------------xxxxxxx-------------------------");
input.createObjectByConstructorname("Container",48);
    }
}
