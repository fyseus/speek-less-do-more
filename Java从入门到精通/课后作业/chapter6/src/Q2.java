public class Q2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int small = arr[0];
        for (int x : arr) {
            if (x < small) {
                small = x;
            }
        }
        System.out.println(small);
    }
}
