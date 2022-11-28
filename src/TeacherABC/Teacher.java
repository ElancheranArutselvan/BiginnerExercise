package TeacherABC;

import java.util.ArrayList;

interface Teacher {
    public void name();
    public void degree();
    public void location();
    public void student();
    public void age();

//    static int m1(ArrayList<Teacher> data, String location) {}
//        int z=0;



}
class Teacher1 implements Teacher{
    @Override
    public void name() {System.out.println("Siva");}

    @Override
    public void degree() {System.out.println("BE");}

    @Override
    public void location() {System.out.println("OND");}

    @Override
    public void student() {System.out.println(1);}

    @Override
    public void age() {System.out.println(34);}
}
class Teacher2 implements Teacher{
    @Override
    public void name() {System.out.println("Ravi");}

    @Override
    public void degree() {System.out.println("BA");}

    @Override
    public void location() {System.out.println("PKT");}

    @Override
    public void student() {System.out.println(2);}

    @Override
    public void age() {System.out.println(30);}
}
class Teacher3 implements Teacher{
    @Override
    public void name() {System.out.println("Lokesh");}

    @Override
    public void degree() {System.out.println("BSC");}

    @Override
    public void location() {System.out.println("Ond");}

    @Override
    public void student() {System.out.println(4);}

    @Override
    public void age() {System.out.println(18);}
}
class Teacher4 implements Teacher{
    @Override
    public void name() {System.out.println("Arun");}

    @Override
    public void degree() {System.out.println("BE");}

    @Override
    public void location() {System.out.println("Pappanadu");}

    @Override
    public void student() {System.out.println(3);}

    @Override
    public void age() {System.out.println(45);}
}
class Teacher5 implements Teacher{
    @Override
    public void name() {System.out.println("Bala");}

    @Override
    public void degree() {System.out.println("ME");}

    @Override
    public void location() {System.out.println("PKT");}

    @Override
    public void student() {System.out.println(1);}

    @Override
    public void age() {System.out.println(20);}
}
class Teacher6 implements Teacher{
    @Override
    public void name() {System.out.println("Pargau");}

    @Override
    public void degree() {System.out.println("Phd");}

    @Override
    public void location() {System.out.println("Uloor");}

    @Override
    public void student() {System.out.println(6);}

    @Override
    public void age() {System.out.println(50);}
}
class Teacher7 implements Teacher{
    @Override
    public void name() {System.out.println("Ganesh");}

    @Override
    public void degree() {System.out.println("ME");}

    @Override
    public void location() {System.out.println("PKT");}

    @Override
    public void student() {System.out.println(7);}

    @Override
    public void age() {System.out.println(48);}
}
class Teacher8 implements Teacher{
    @Override
    public void name() {System.out.println("Gangai");}

    @Override
    public void degree() {System.out.println("MBA");}

    @Override
    public void location() {System.out.println("Ond");}

    @Override
    public void student() {System.out.println(2);}

    @Override
    public void age() {System.out.println(35);}
}
class Teacher9 implements Teacher{
    @Override
    public void name() {System.out.println("Ulagu");}

    @Override
    public void degree() {System.out.println("BE");}

    @Override
    public void location() {System.out.println("Uloor");}

    @Override
    public void student() {System.out.println(4);}

    @Override
    public void age() {System.out.println(60);}
}
class Teacher10 implements Teacher{
    @Override
    public void name() {System.out.println("Seetha");}

    @Override
    public void degree() {System.out.println("ME");}

    @Override
    public void location() {System.out.println("PKT");}

    @Override
    public void student() {System.out.println(5);}

    @Override
    public void age() {System.out.println(38);}
}

class Main{
    public static void main(String[] args) {
        Teacher1 t1 = new Teacher1();
        Teacher2 t2 = new Teacher2();
        Teacher3 t3 = new Teacher3();
        Teacher4 t4 = new Teacher4();
        Teacher5 t5 = new Teacher5();
        Teacher6 t6 = new Teacher6();
        Teacher7 t7 = new Teacher7();
        Teacher8 t8 = new Teacher8();
        Teacher9 t9 = new Teacher9();
        Teacher10 t10 = new Teacher10();
//        t1.name();t1.degree();t1.location();t1.student();t1.age();
//        t2.name();t2.degree();t2.location();t2.student();t2.age();
//        t3.name();t3.degree();t3.location();t3.student();t3.age();
//        t4.name();t4.degree();t4.location();t4.student();t4.age();
//        t5.name();t5.degree();t5.location();t5.student();t5.age();
//        t6.name();t6.degree();t6.location();t6.student();t6.age();
//        t7.name();t7.degree();t7.location();t7.student();t7.age();
//        t8.name();t8.degree();t8.location();t8.student();t8.age();
//        t9.name();t9.degree();t9.location();t9.student();t9.age();
//        t10.name();t10.degree();t10.location();t10.student();t10.age();
        ArrayList<Teacher>data = new ArrayList<>();
        data.add(t1);
        data.add(t2);
        data.add(t3);
        data.add(t4);
        data.add(t5);
        data.add(t6);
        data.add(t7);
        data.add(t8);
        data.add(t9);
        data.add(t10);
        System.out.println(data);
        System.out.println(data.size());
        System.out.println(data.get(1));

    }
}