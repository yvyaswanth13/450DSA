import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int total = n + m;
        int gap = (total + 1) / 2; // Initial gap

        while (gap > 0) {
            int i = 0, j = gap;

            while (j < total) {
                if (j < n && arr1[i] > arr1[j]) {
                    swap(arr1, i, j);
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    swap(arr1, arr2, i, j - n);
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    swap(arr2, i - n, j - n);
                }
                i++;
                j++;
            }

            gap = (gap > 1) ? (gap + 1) / 2 : 0;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void swap(int[] arr1, int[] arr2, int i, int j) {
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        mergeSortedArrays(arr1, arr2);

        System.out.println("Merged arrays:");
        System.out.println(Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }
}
