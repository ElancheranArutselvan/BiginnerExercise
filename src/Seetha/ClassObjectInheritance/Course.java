package Seetha.ClassObjectInheritance;

import java.io.Console;

public abstract class Course {
    private String name;
   public Course(String name){      // ... with constructor
        this.name = name;
    }
    public abstract boolean Passed();
}
class BooleanCourse extends Course {   // Inherits from Course
    private boolean grade;
    public BooleanCourse(String name, boolean grade) {
        super(name);
        this.grade = grade;
    }
    public boolean Passed() {
        return grade;
    }
}
class GradedCourse extends Course{   // Inherits from Course
private int grad;
public GradedCourse(String name, int grad){
        super(name);

        this.grad = grad;
        }
public boolean Passed(){
        return grad >= 2;
        }
        }
class Project{
    private Course c1, c2, c3, c4;   // Course is the common type
    // of all four variables.

    public Project(Course c1, Course c2, Course c3, Course c4){   // All parameters of type Course
        this.c1 = c1; this.c2 = c2;
        this.c3 = c3; this.c4 = c4;
    }
    public boolean Passed(){
        return
                (c1.Passed() && c2.Passed() && c3.Passed() && c4.Passed()) ||
                        (!(c1.Passed()) && c2.Passed() && c3.Passed() && c4.Passed()) ||
                        (c1.Passed() && !(c2.Passed()) && c3.Passed() && c4.Passed()) ||
                        (c1.Passed() && c2.Passed() && !(c3.Passed()) && c4.Passed()) ||
                        (c1.Passed() && c2.Passed() && c3.Passed() && !(c4.Passed()));
    }

}
class Program {
    public static void main(String[] args) {
        Course c1 = new BooleanCourse("Math", true),          // All variables declared of type Course
                c2 = new BooleanCourse("Geography", true),
                c3 = new GradedCourse("Programming", 0),
                c4 = new GradedCourse("Algorithms", 3);

        Project p = new Project(c1, c2, c3, c4);
        System.out.println("Project Passed: {0} "+p.Passed());

    }
}
