package Vathi;

import JavaExercises.BasicStringEx.GetSubstring;

import java.util.ArrayList;

public class Master {
        public static Object t1(String a1, String a2, String a3, int a4, int a5){
            return (a1+", "+a2+", "+a3+", "+a4+", "+a5);
//        Object a = new []{String a1, String a2, String a3, int a4, int a5};
        }
        public static Object t2(String b1, String b2, String b3, int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);

        }
        public static Object t3(String b1, String b2, String b3, int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        }
        public static Object t4(String b1, String b2, String b3, int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        }
        public static Object t5(String b1, String b2, String b3, int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        }
        public static Object t6(String b1, String b2, String b3, int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        }
        public static Object t7(String b1,String b2,String b3,int b4, int b5){
            return (b1+", "+b2+", "+b3+", "+b4+", "+b5);

        } public static Object t8(String b1,String b2,String b3,int b4, int b5){
        return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        } public static Object t9(String b1,String b2,String b3,int b4, int b5){
        return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        } public static Object t10(String b1,String b2,String b3,int b4, int b5){
        return (b1+", "+b2+", "+b3+", "+b4+", "+b5);
        }

        public static void main(String[] args) {
            Master myInput = new Master();
//      myInput.t1("Siva ","BE","Ond",1,34);
//      myInput.t2("Ravi","BA","Papanadu",2,30);
//        myInput.t3("Lokesh","BSC","Papanadu",4,18);
//        myInput.t4("Arun","BE","Pkt",3,45);
//        myInput.t5("Bala","ME","Uloor",1,20);
//        myInput.t6("Pargav","PHD","Madukkoor",6,50);
//        myInput.t7("Ganesh","ME","Pkt",8,48);
//        myInput.t8("Gangai","MBA","Ond",2,35);
//        myInput.t9("Ulagu","BE","Alathoor",4,60);
//        myInput.t10("Raj","ME","Papanadu",5,38);
            ArrayList data = new ArrayList<>();
            data.add(myInput.t1("Siva ","BE","Ond",1,34));
            data.add("\n"+myInput.t2("Ravi","BA","Papanadu",2,30));
            data.add("\n"+myInput.t3("Lokesh","BSC","Papanadu",4,18));
            data.add("\n"+myInput.t4("Arun","BE","Pkt",3,45));
            data.add("\n"+myInput.t5("Bala","ME","Uloor",1,20));
            data.add("\n"+myInput.t6("Pargav","PHD","Madukkoor",6,50));
            data.add("\n"+myInput.t7("Ganesh","ME","Pkt",8,48));
            data.add("\n"+myInput.t8("Gangai","MBA","Ond",2,35));
            data.add("\n"+myInput.t9("Ulagu","BE","Alathoor",4,60));
            data.add("\n"+myInput.t10("Raj","ME","Papanadu",5,38));
            System.out.println(data);
            System.out.println(data.size());
            System.out.println(data.get(3));
//            int count =1;
//            for(int i=0;i< data.size();i++){
//                    if(data.contains("Pkt")){
//                        count++;
//                    }
//            }System.out.println("Total No.of teachers Belongs to Location Pkt is: "+count );



        }
//        public static int add(int l){
//
//        }
}
