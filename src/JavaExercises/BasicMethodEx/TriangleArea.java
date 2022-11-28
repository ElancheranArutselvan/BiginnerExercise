package JavaExercises.BasicMethodEx;
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter side a ");
        a= info.nextDouble();
        System.out.println("Enter side b ");
        b= info.nextDouble();
        System.out.println("Enter side c ");
        c= info.nextDouble();
        System.out.println(valid(a,b,c) ?
                "Area of triangle is : " + triangleArea(a,b,c) :
                "invalid Triangle");
    }
    public static boolean valid(double d,double e,double f) {

        if (d + e > f && e + f > d && f + d > e) {
            return true;
        } else {
            return false;
        }
    } public static double triangleArea(double d,double e,double f){
            double area;
            double s = (d + e + f) / 2;
            area = Math.sqrt(s * (s - d) * (s - e) * (s - f));
            return area;

}
}
