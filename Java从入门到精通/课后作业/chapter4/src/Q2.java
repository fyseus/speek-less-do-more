
import static java.lang.Math.abs;

public class Q2 {
    public static void main(String[] args) {
        char point = '.';
        for (int row = 0; row < 9; row++) {
            for (int num = abs(4 - row); num > 0; num--) {
                System.out.print(' ');
            }
            System.out.print(point);
            for (int num = abs(4 - row) * 2; num < 7; num++) {
                System.out.print(' ');
            }
            if (row != 0 && row != 8) {
                System.out.println(point);
            } else {
                System.out.println();
            }

        }
    }
}
