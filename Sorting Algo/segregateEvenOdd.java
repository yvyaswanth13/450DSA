import java.util.Arrays;

public class Main {
    public static void segregateEvenOdd(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            while (arr[lo] % 2 == 0 && lo < hi)
                lo++;
            while (arr[hi] % 2 == 1 && lo < hi)
                hi--;
            if (lo < hi) {
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 34, 45, 9, 8, 90, 3};
        segregateEvenOdd(arr);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
// Array after segregation: [0, 34, 90, 8, 9, 45, 3]
    }
}
