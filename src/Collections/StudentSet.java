package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class StudentSet {
    private String name;
    private String city;
    private int age;
    StudentSet(String name, String city,int age){
        this.name=name;
        this.city = city;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public static void main(String[] args) {
        StudentSet s1 = new StudentSet("Siva","madurai",26);
        StudentSet s2 = new StudentSet("Raj","Chennai",25);
        StudentSet s3 = new StudentSet("Elaa","Thanjai",30);
        StudentSet s4 = new StudentSet("Siva","madurai",26);
        HashSet<StudentSet>studentlist = new HashSet<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        studentlist.add(s4);
        System.out.println(studentlist.size());
        Iterator iter = studentlist.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+" , ");

        }

    }
}
