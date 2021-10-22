public class Q2 {
    public static void main(String[] args) {
        String str1 = "abcABC";
        String str2 = "ABCABC";
        if (str1.substring(3, 5).equalsIgnoreCase(str2.substring(0, 2))) {
            System.out.println("两个子串相同");
        } else {
            System.out.println("两个子串并不相同");
        }
    }
}
