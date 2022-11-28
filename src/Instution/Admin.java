package Instution;

import java.util.ArrayList;

public class Admin {
    private ArrayList<Student> studentList;

    Admin(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentArrayList) {
        this.studentList = studentArrayList;
    }

    public void studentCount(ArrayList<Student> studentArrayList, int standard) {
        int count = 0;
        for (Student student : studentArrayList) {
            if (student.getStandard() == standard) {
                count++;
            }
        }
        System.out.println("Student count for this class is : " + count);
    }

    public void genderWiseCount(ArrayList<Student> studentArrayList, String gender) {
        int count = 0;
        for (Student student : studentArrayList) {
            if (student.getGender() == gender) {
                count++;
            }
        }
        System.out.println("Student count for this gender is : " + count);
    }

    public static int totalAge(ArrayList<Student> studentArrayList, int standard) {
        int sum = 0;
        for (Student student : studentArrayList) {
            if (student.getStandard() == standard) {
                sum += student.getAge();
            }
        }
        return sum;
    }

    public static int ageWiseCount(ArrayList<Student> studentArrayList, int age) {
        int count = 0;
        for (Student student : studentArrayList) {
            if (student.getAge() <= age) {
                count++;
            }
        }
        return count;
    }
    public void startWithA(ArrayList<Student>studentArrayList,String letter) {
            for (Student student : studentArrayList) {
                if (student.getName().startsWith(letter)) {
                    System.out.println(student.getName());
                }
        }

    }
    public void maleFemalecount(ArrayList<Student>studentArrayList,int standard, String yes){
        int count =0;
        for (Student student : studentArrayList){
            if(student.getGender()== yes){
                count++;
            }
        }System.out.println("No of Male students in this class is "+count);
        System.out.println("No of female students in this class  is : "+(studentArrayList.size()-count));
    }

    public boolean wearSpecs(ArrayList<Student> studentArrayList) {
        for (Student student : studentArrayList) {
            if (student.getWearSpecs()==true) {
                System.out.println(student.getName());
            }
        }return true;
    }
}