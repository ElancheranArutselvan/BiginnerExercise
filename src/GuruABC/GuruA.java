package GuruABC;

import java.util.ArrayList;

public class GuruA {
    String name ;
    String degree;
    String location;
    int standard;
    int age;
    public GuruA(String a, String b, String c, int d, int e){
        name = a;
        degree = b;
        location =c;
        standard =d;
        age = e;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDegree(){
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStandard() {
        return standard;
    }

    public void setStudent(int standard) {
        this.standard = standard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static int method1(ArrayList<GuruA>data, String location) {
        int count =0;
        for(GuruA abc : data){
            if(abc.getLocation().equals(location)){
                count++;
            }
        }
        return count;
    }
    public static int method2(ArrayList<GuruA>data, String location,int standard) {
        int count =0;
        for(GuruA abc : data){
            if(abc.getLocation().equals(location) && abc.getStandard()==standard){
                count++;
            }
        }
        return count;
    }
    public static int method3(ArrayList<GuruA>data, int age1,int age2) {
        int count =0;
        for(GuruA abc : data){
            if((age1<=abc.getAge() && (abc.getAge()<=age2))){
                count++;
            }
        }
        return count;
    }
    public static int method4(ArrayList<GuruA>data, String degree) {
        int count =0;
        for(GuruA abc : data){
            if(abc.getDegree().equals(degree)){
                count++;
            }
        }
        return count;

    }
    public static int method5(ArrayList<GuruA>data, String location) {
        int count =0;
        int sum = 0;
        for(GuruA abc : data){
            if(abc.getLocation().equals(location)) {
                count++;
                sum += abc.getAge();
            }
        }
        return sum;
    }
}
