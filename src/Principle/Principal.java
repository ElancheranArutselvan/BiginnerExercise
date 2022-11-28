package Principle;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    String name;
    String degree;
    String location;
    int student;
    int age;

    public Principal(String a, String b, String c, int d, int e) {
        name = a;
        degree = b;
        location = c;
        student = d;
        age = e;
    }

    public static int method1(ArrayList<Principal> data, String location) {
        int count = 0;
        for (Principal abc : data) {
            if (abc.location == location) {
                count++;
            }
        }
        return count;
    }

    public static int method2(ArrayList<Principal> data, String location, int student) {
        int count = 0;
        for (Principal abc : data) {
            if (abc.location == location && abc.student == student) {
                count++;
            }
        }
        return count;
    }

    public static int method3(ArrayList<Principal> data, String degree) {
        int count = 0;
        for (Principal abc : data) {
            if (abc.degree == degree) {
                count++;
            }
        }
        return count;
    }

    public static int method4(ArrayList<Principal> data, String location) {
        int count = 0;
        int sum = 0;
        for (Principal abc : data) {
            if (abc.location == location) {
                count++;
                sum += abc.age;
            }
        }
        return sum;
    }

    public static int method5(ArrayList<Principal> data, int age) {
        int count = 0;
        for (Principal abc : data) {
            if (abc.age > 40) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Principal obj1 = new Principal("Siva ", "BE", "Ond", 1, 34);
        Principal obj2 = new Principal("Ravi", "BA", "Papanadu", 2, 30);
        Principal obj3 = new Principal("Lokesh", "BSC", "Papanadu", 4, 18);
        Principal obj4 = new Principal("Arun", "BE", "Pkt", 3, 45);
        Principal obj5 = new Principal("Bala", "ME", "Uloor", 1, 20);
        Principal obj6 = new Principal("Pargav", "PHD", "Uloor", 6, 50);
        Principal obj7 = new Principal("Ganesh", "ME", "Pkt", 8, 48);
        Principal obj8 = new Principal("Gangai", "MBA", "Ond", 2, 35);
        Principal obj9 = new Principal("Ulagu", "BE", "Ond", 4, 60);
        Principal obj10 = new Principal("Raj", "ME", "Papanadu", 5, 38);

        ArrayList<Principal> data = new ArrayList<>();
        data.add(obj1);
        data.add(obj2);
        data.add(obj3);
        data.add(obj4);
        data.add(obj5);
        data.add(obj6);
        data.add(obj7);
        data.add(obj8);
        data.add(obj9);
        data.add(obj10);
        System.out.println("\n" + data);
        System.out.println("\n" + data.size());
        System.out.println(method1(data,"Ond"));
        System.out.println(method2(data,"Pkt",8));
        System.out.println(method3(data,"ME"));
        System.out.println(method4(data,"Papanadu"));
        System.out.println(method5(data,45));
        Scanner info = new Scanner(System.in);
        System.out.println("Enter Location from  Ond/Pkt/Papanadu/Uloor : ");
        String g = info.nextLine();
//        if (g =="Ond") {
//            System.out.println("Total No of teachers belongs to " + g + " is : " + Principal.method1(data, g));
//        }else if (g=="Pkt") {
//            System.out.println("Total No of teachers belongs to " + g + " is : " + Principal.method1(data, g));
//        }else if (g=="Papanadu") {
//            System.out.println("Total No of teachers belongs to " + g + " is : " + Principal. method1(data, g));
//        }else if (g=="Uloor") {
//            System.out.println("Total No of teachers belongs to " + g + " is : " + Principal.method1(data, g));
//        }else {
//            System.out.println("Invalid. Enter Correct location");
//        }

    }

}
