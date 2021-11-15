import java.util.Arrays;
public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = Arrays.copyOf(arr1,4);
        for(int x : arr1){
            System.out.print(x+",");
        }
        System.out.println();
        for(int x : arr2){
            System.out.print(x+",");
        }
    }
}
