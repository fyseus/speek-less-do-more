import java.math.BigDecimal;

public class Q3 {
    public BigDecimal div(double val1, double val2, int b) {
        if (b < 0) {
            System.out.println("b>0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(val1));
        BigDecimal b2 = new BigDecimal(Double.toString(val2));
        return b1.divide(b2, b, BigDecimal.ROUND_DOWN);
    }
    public static void main(String[] args) {
        Q3 b = new Q3();
        System.out.println(b.div(4,3,2));
    }
}
