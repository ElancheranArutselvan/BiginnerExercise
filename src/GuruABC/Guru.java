package GuruABC;

import java.util.Scanner;

import java.util.ArrayList;

public class Guru {
    public static void main(String[] args) {
        GuruA obj1 = new GuruA("Siva ", "BE", "Ond", 1, 34);
        GuruA obj2 = new GuruA("Ravi", "BA", "Papanadu", 2, 30);
        GuruA obj3 = new GuruA("Lokesh", "BSC", "Papanadu", 4, 18);
        GuruA obj4 = new GuruA("Arun", "BE", "Pkt", 3, 45);
        GuruA obj5 = new GuruA("Bala", "ME", "Uloor", 1, 20);
        GuruA obj6 = new GuruA("Pargav", "PHD", "Uloor", 6, 50);
        GuruA obj7 = new GuruA("Ganesh", "ME", "Pkt", 8, 48);
        GuruA obj8 = new GuruA("Gangai", "MBA", "Ond", 2, 35);
        GuruA obj9 = new GuruA("Ulagu", "BE", "Ond", 4, 60);
        GuruA obj10 = new GuruA("Raj", "ME", "Papanadu", 5, 38);

        ArrayList<GuruA> stafflist = new ArrayList<>();
        stafflist.add(obj1);
        stafflist.add(obj2);
        stafflist.add(obj3);
        stafflist.add(obj4);
        stafflist.add(obj5);
        stafflist.add(obj6);
        stafflist.add(obj7);
        stafflist.add(obj8);
        stafflist.add(obj9);
        stafflist.add(obj10);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Location from  Ond/Pkt/Papanadu/Uloor : ");
        String g = input.nextLine();
        if (g.equals("Ond")||g.equals("Pkt")||g.equals("Papanadu")||g.equals("Uloor")) {
            System.out.println("Total No of teachers belongs to " + g + " is : " + GuruA.method1(stafflist, g));
        }else {
            System.out.println("Invalid. Enter Correct location");
        }
        System.out.println("Enter Location from  Ond/Pkt/Papanadu/Uloor : ");
        String h= input.nextLine();
        System.out.println("Enter Standard such as 1/2/3/4/5/6/8 : ");
        int s = input.nextInt();
        if((h.equals("Uloor")||h.equals("Papanadu")||h.equals("Pkt")||h.equals("Ond")) && (s==1 ||s==2||s==3||s==4||s==5||s==6||s==8) ){
            System.out.println("No of teachers from "+h+" whose taking classes for "+s+" are : "+GuruA.method2(stafflist,h,s));
        }else{
            System.out.println("Enter valid Data");
        }
        System.out.println("Enter age1 ");
        int n1 = input.nextInt();
        System.out.println("Enter age2 ");
        input.nextLine();
        int n2 = Integer.parseInt(input.nextLine());
        if(n1<=n2){
            System.out.println("No of teachers whose age between "+n1+" and "+n2+" are "+GuruA.method3(stafflist,n1,n2));
        }
        System.out.println("Enter degree from BE/ME/BSC/PHD/BA/MBA : ");
        String l = input.nextLine();
        if(l.equals("BE")||l.equals("ME")||l.equals("MBA")||l.equals("BA")||l.equals("PHD")||l.equals("BSC"))
        {
            System.out.println("No of teacher have "+l+" degree is : "+GuruA.method4(stafflist,l));
        }
        System.out.println("Enter Location from  Ond/Pkt/Papanadu/Uloor : ");
        String k= input.nextLine();
        if((k.equals("Uloor")||k.equals("Papanadu")||k.equals("Pkt")||k.equals("Ond"))){
            System.out.println("Sum of ages of teachers belongs to "+k+" is : "+GuruA.method5(stafflist,k));

        }

//        switch (g){
//            case "Ond":
//            System.out.println("Total No of teachers belongs to " + g + " is : " + GuruA.method1(stafflist, g));
//        break;
//            case "Pkt":
//            System.out.println("Total No of teachers belongs to " + g + " is : " + GuruA.method1(stafflist, g));
//            break;
//            case "Papanadu":
//            System.out.println("Total No of teachers belongs to " + g + " is : " + GuruA. method1(stafflist, g));
//        break;
//            case "Uloor":
//            System.out.println("Total No of teachers belongs to " + g + " is : " + GuruA.method1(stafflist, g));
//        break;
//            default:
//            System.out.println("Invalid. Enter Correct location");
//        }

        System.out.println(GuruA.method1(stafflist,"Ond"));
        System.out.println(GuruA.method2(stafflist,"Ond",4));
        System.out.println(GuruA.method3(stafflist,20,40));
        System.out.println(GuruA.method4(stafflist,"BE"));
        System.out.println(GuruA.method5(stafflist,"Papanadu"));

}}