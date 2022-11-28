package Seetha.AccessModifier;
import java.lang.reflect.*;
public class PrivateMethodCall {
    private String truck;
    private Integer wheels;
    private  PrivateMethodCall(){}
    private PrivateMethodCall(String _truck,Integer _wheels){
        this.truck = _truck;
        this.wheels = _wheels;
    }
    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
}
