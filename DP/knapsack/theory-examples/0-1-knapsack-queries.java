 // https://www.geeksforgeeks.org/0-1-knapsack-queries/?ref=lbp

import java.util.*;

public class SubsetSum {
    
    static int maxsum(int arr[], int sum, int i) {
        if (sum == 0 || i == 0) return 0;  // Base case: If sum is 0 or no items left, return 0

        int notake = maxsum(arr, sum, i - 1);  // Case where we don't take arr[i-1]

        int take = 0;
        if (arr[i - 1] <= sum) {  // Only take if it's not exceeding sum
            take = arr[i - 1] + maxsum(arr, sum - arr[i - 1], i - 1);
        }

        return Math.max(take, notake);  // Return the best possible sum ≤ given sum
    }

    static List<Integer> check(int weights[], int q[]) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < q.length; i++) {
            int x = maxsum(weights, q[i], weights.length);
            res.add(x);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] weights = {1, 5, 10};
        int[] queries = {6, 14};

        List<Integer> results = check(weights, queries);
        for (int result : results) {
            System.out.println(result);
        }
    }
}
