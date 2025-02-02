//https://www.geeksforgeeks.org/minimum-number-jumps-reach-endset-2on-solution/
//https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
class Solution {
    // Memoization table to store results of subproblems
    static int[] memo;

    static int minJumps(int[] arr) {
        int n = arr.length;
        // Initialize memo array with -1 (indicating uncomputed states)
        memo = new int[n];
        for (int i = 0; i < n; i++) {
            memo[i] = -1;
        }
int res=minans(0, arr);
        // Start recursive calculation from index 0
        return res== Integer.MAX_VALUE ? -1: res;
    }

    static int minans(int i, int[] arr) {
        // Base case: if we reach the end or beyond, no further jumps needed
        if (i >= arr.length - 1) {
            return 0;
        }

        // If we are at a position with a 0 value, we can't move further
        if (arr[i] == 0) {
            return Integer.MAX_VALUE;
        }

        // Check if the result has already been computed
        if (memo[i] != -1) {
            return memo[i];
        }

        // Initialize the result as a large value (since we're looking for minimum)
        int ans = Integer.MAX_VALUE;

        // Explore all possible jumps from the current position
        for (int j = i + 1; j <= i + arr[i] && j < arr.length; j++) {
            int val = minans(j, arr);
            if (val != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + val);  // 1 for the current jump
            }
        }

        // Memoize the result
        memo[i] = ans;
        return ans;
    }
}
