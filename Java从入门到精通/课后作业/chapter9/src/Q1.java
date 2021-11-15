import java.lang.Math;
public class Q1 {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 0; i < 6; i++) {
            ans += getEvenNumber(2, 32);
        }
        System.out.println(ans);
    }
    public static int getEvenNumber(int num1, int num2) {
        int num = num1 + (int)(Math.random() * (num2 - num1));
        if (num % 2 ==0) {
            return num;
        } else {
            return num - 1;
        }
    }

}
