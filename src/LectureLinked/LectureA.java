package LectureLinked;

import java.util.LinkedList;

public class LectureA {
    String name;
    String degree;
    String location;
     int standard;
     int age;
public LectureA(String x, String y,String z,int v, int w){
    name = x; degree=y; location=z;standard =v;age=w;
}
 public static int firstCall(LinkedList<LectureA>lecture,String location){
    int total =0;
    for(LectureA list : lecture){
        if(list.location == location){
            total++;
        }
    }return total;
 }
    public static int secondtCall(LinkedList<LectureA>lecture,String location,int standard){
        int total =0;
        for(LectureA list : lecture){
            if(list.location == location && list.standard == standard){
                total++;
            }
        }return total;
    }
    public static int thirdCall(LinkedList<LectureA>lecture,String degree){
        int total =0;
        for(LectureA list : lecture){
            if(list.degree == degree){
                total++;
            }
        }return total;
    }
    public static int forthCall(LinkedList<LectureA>lecture,int age){
        int total =0;
        for(LectureA list : lecture){
            if(list.age > age){
                total++;
            }
        }return total;
    }
    public static int fifthCall(LinkedList<LectureA>lecture,String degree){
        int total =0;
        int totalAge =0;
        for(LectureA list : lecture){
            if(list.degree == degree){
                total++;
                totalAge +=list.age;
            }
        }return totalAge;
    }
    public static void main(String[] args) {
        LectureA teacher1 = new LectureA("Siva ", "BE", "Ond", 1, 34);
        LectureA teacher2 = new LectureA("Ravi", "BA", "Papanadu", 2, 30);
        LectureA teacher3 = new LectureA("Lokesh", "BSC", "Papanadu", 4, 36);
        LectureA teacher4 = new LectureA("Arun", "BE", "Pkt", 3, 45);
        LectureA teacher5 = new LectureA("Bala", "ME", "Uloor", 1, 20);
        LectureA teacher6 = new LectureA("Pargav", "PHD", "Uloor", 6, 50);
        LectureA teacher7 = new LectureA("Ganesh", "ME", "Pkt", 8, 48);
        LectureA teacher8 = new LectureA("Gangai", "MBA", "Ond", 2, 35);
        LectureA teacher9 = new LectureA("Ulagu", "BE", "Ond", 4, 60);
        LectureA teacher10 = new LectureA("Raj", "ME", "Papanadu", 5, 38);
        LinkedList<LectureA>lecture = new LinkedList<>();
        lecture.add(teacher1);
        lecture.add(teacher2);
        lecture.add(teacher3);
        lecture.add(teacher4);
        lecture.add(teacher5);
        lecture.add(teacher6);
        lecture.add(teacher7);
        lecture.add(teacher8);
        lecture.add(teacher9);
        lecture.add(teacher10);
        System.out.println(lecture);
        System.out.println("\n"+lecture.size());
        System.out.println(firstCall(lecture,"Pkt"));
        System.out.println(secondtCall(lecture,"Papanadu",4));
        System.out.println(thirdCall(lecture,"ME"));
        System.out.println(forthCall(lecture,45));
        System.out.println(fifthCall(lecture,"ME"));
    }
}
