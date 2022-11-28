package Instution;

public class Student {
    private String name;
    private String id;
    private int standard;
    private String mobile;
    private String gender;
    private boolean wearSpecs;
    private String isHostel;
    private String city;

    private int age;
    Student(String name, String id,int standard,String mobile,String gender, String isHostel,boolean wearSpecs, String city, int age){
        this.name=name;
        this.id=id;
        this.standard=standard;
        this.mobile=mobile;
        this.gender=gender;
        this.isHostel=isHostel;
        this.wearSpecs=wearSpecs;
        this.city=city;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
       this.standard = standard;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getWearSpecs() {
        return wearSpecs;
    }

    public void setWearSpecs(boolean wearSpecs) {
        this.wearSpecs = wearSpecs;
    }

    public String getIsHostel() {
        return isHostel;
    }

    public void setIsHostel(String isHostel) {
        this.isHostel = isHostel;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
