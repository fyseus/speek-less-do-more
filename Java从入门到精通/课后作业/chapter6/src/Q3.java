public class Q3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"a","c","d"};
        for (String x : arr) {
            System.out.println(x);
        }
        arr[2] = "bb";
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
