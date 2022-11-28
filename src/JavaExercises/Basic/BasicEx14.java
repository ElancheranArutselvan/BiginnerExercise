package JavaExercises.Basic;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicEx14 {

    public static void main(String[] args) {
        int x = 567;
        System.out.printf("Printing simple integer : x = %d ",x);
        System.out.printf("\njust print = %d+%d%d+%d%d%d",x,x,x,x,x,x);
        System.out.printf("\nvalue of PI is : PI = %.3f\n",Math.PI);
        float k= 25.36985f;
        System.out.printf("\n print float value k= %.4f",k);
        double j = 258674.567d;
        System.out.printf("\n Print value j=%1.1f",j);
        DecimalFormat gh = new DecimalFormat("####");
        System.out.printf("\n round value without decimal j = "+gh.format(j));
        gh = new DecimalFormat("#.##");
        System.out.printf("\n Print value j = "+gh.format(j));
        gh = new DecimalFormat("#.0000");
        System.out.printf("\n Print value j = "+gh.format(j));
        gh = new DecimalFormat("0.00");
        System.out.printf("\n Print value j = "+gh.format(j));
        gh = new DecimalFormat("###,###.### Rs");
        System.out.printf("My Salary is = "+gh.format(j));
        SimpleDateFormat ij = new SimpleDateFormat("dd-MM-yyyy");
        String efg = ij.format(new Date());
        System.out.printf("\nFormated date = "+efg);
    }

}
