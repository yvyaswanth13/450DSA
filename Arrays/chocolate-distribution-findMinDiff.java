//https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem/0

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // If there are fewer than m elements, return -1
        if (arr.size() < m) {
            return -1;
        }

        // Sort the array to make it easier to find the smallest range
        Collections.sort(arr);

        // Initialize the minimum difference as large as possible
        int ans = Integer.MAX_VALUE;

        // Traverse the array and calculate the difference for every window of size m
        for (int i = 0; i + m - 1 < arr.size(); i++) {
            int min = arr.get(i);            // Starting point of the window
            int max = arr.get(i + m - 1);    // Ending point of the window
            int diff = max - min;            // Calculate the difference
            ans = Math.min(ans, diff);       // Update the answer with the minimum difference
        }

        return ans;
    }
}
