package Instution;

import java.util.ArrayList;

public class StudentRegister {
    public static void main(String[] args) throws NoSuchMethodException {
        Student s1 = new Student("Aabi","ab11",4,"Nokia","Male","Yes",false,"Madurai",9);
        Student s2 = new Student("Siva","ab12",2,"Oppo","Male","No",true,"Chennai",7);
        Student s3 = new Student("Rajee","ab13",3,"LG","Female","Yes",false,"Nellai",8);
        Student s4 = new Student("Ajay","ab14",7,"Nokia","Male","Yes",false,"Madurai",12);
        Student s5 = new Student("Vijay","ab15",4,"Samsung","Male","No",true,"Theni",9);
        Student s6 = new Student("Priya","ab16",9,"LG","Female","Yes",true,"Chennai",14);
        Student s7 = new Student("Ram","ab17",3,"MI","Male","No",false,"Madurai",8);
        Student s8 = new Student("Anbu","ab18",5,"Redmi","Male","No",true,"Nellai",10);
        Student s9 = new Student("Abinaya","ab19",4,"Sony","Female","Yes",false,"Thanjavur",9);
        Student s10 = new Student("Keerthi","ab20",1,"Apple","Female","No",false,"Thanjavur",6);
        Student s11 = new Student("karthi","ab21",2,"Nokia","Male","Yes",true,"Kovai",7);
        Student s12 = new Student("Abi","ab22",6,"MI","Female","No",true,"Madurai",11);
        Student s13= new Student("Suba","ab23",8,"Oppo","Female","Yes",false,"Nellai",13);
        Student s14 = new Student("Swathi","ab24",6,"LG","Female","Yes",true,"Theni",11);
        Student s15= new Student("kavi","ab25",5,"Nokia","Male","No",true,"Trichy",10);
        ArrayList<Student>studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        studentList.add(s7);
        studentList.add(s8);
        studentList.add(s9);
        studentList.add(s10);
        studentList.add(s11);
        studentList.add(s12);
        studentList.add(s13);
        studentList.add(s14);
        studentList.add(s15);
        System.out.println(studentList.size());
        Admin admin = new Admin(studentList);
        admin.studentCount(studentList,4);
        admin.genderWiseCount(studentList,"Male");
        int ageTotal = Admin.totalAge(studentList,4);
        System.out.println("Total of students from 4th Std is : "+ageTotal);
        System.out.println("No of students whose age is less than or equal to 10 is : "+Admin.ageWiseCount(studentList,10));
        System.out.println("Names Start with A");
        admin.startWithA(studentList,"A");
        admin.maleFemalecount(studentList, 4,"Male");
        System.out.println("Students Wearing specs : ");
        admin.wearSpecs(studentList);
    }
}
