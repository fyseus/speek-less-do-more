public class Q3 {
    public static void main(String[] args) {
        int dividor = 1;
        int count = 1;
        double ans = 0;
        while (count <= 20) {
            ans += 1.0 / (double)dividor;
            count++;
            dividor *= count;
        }
        System.out.println(ans);
    }
}
