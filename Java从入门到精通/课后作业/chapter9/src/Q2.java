import java.text.DecimalFormat;

public class Q2 {
    public static String calArea(double r) {
        String pattern = "#.00000";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        double area = Math.PI * r * r;
        return myFormat.format(area);
    }
    public static void main(String[] args) {
        System.out.println(calArea(3));
    }
}
