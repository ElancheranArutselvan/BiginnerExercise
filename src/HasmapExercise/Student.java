package HasmapExercise;

import java.util.HashMap;

public class Student {
    private String studentId;
    private String name;
    private int age;
    Student(String studentId,String name,int age){
        this.studentId=studentId;
        this.name = name;
        this.age = age;
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("R23","Ram",15);
        Student s2 = new Student("R24","Vasu",14);
        Student s3 = new Student("R25","Ilan",18);
        HashMap<String,Student>studentList = new HashMap<>();
        studentList.put(s1.studentId,s1);
        studentList.put(s2.studentId,s2);
        studentList.put(s3.studentId,s3);
        System.out.println(studentList.size());
        System.out.println(studentList.keySet());
        System.out.println(studentList.get(s1.studentId).getAge());
        System.out.println(studentList.values());
    }
}
