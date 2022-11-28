import java.math.BigDecimal;

public class RoundFloat {
    public static void main(String[] args) {
        float k= 567.890764f;
        int l= (int) k;
        System.out.println(l);
        int decimalPlace = 3;
        BigDecimal m = new BigDecimal(Float.toString(k));
        m = m.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        System.out.printf("%.6f\n",k);
        System.out.println(m);

    }
}
