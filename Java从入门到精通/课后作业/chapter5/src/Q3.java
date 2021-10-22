public class Q3 {
    public static void main(String[] args) {
        String regex = "1+\\d{10}";
        String text = "13964443155";
        if (text.matches(regex)) {
            System.out.println("是手机号");
        } else {
            System.out.println("不是手机号");
        }
    }
}
