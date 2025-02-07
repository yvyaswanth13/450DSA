import java.util.*;

class UniquePaths {

    // Helper function to find unique paths using memoization with HashMap
    static int UniquePathHelper(int i, int j, int r, int c, int[][] grid, Map<String, Integer> memo) {
        // If out of bounds, return 0
        if (i == r || j == c) {
            return 0;
        }

        // If cell is an obstacle, return 0
        if (grid[i][j] == 1) {
            return 0;
        }

        // If reached the bottom-right cell, return 1
        if (i == r - 1 && j == c - 1) {
            return 1;
        }

        // Generate key for memoization
        String key = i + "," + j;

        // If value is already computed, return it
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Compute and store the result in memo
        int result = UniquePathHelper(i + 1, j, r, c, grid, memo) +
                     UniquePathHelper(i, j + 1, r, c, grid, memo);

        memo.put(key, result);
        return result;
    }

    // Function to find unique paths with obstacles
    static int uniquePathsWithObstacles(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        Map<String, Integer> memo = new HashMap<>();
        return UniquePathHelper(0, 0, r, c, grid, memo);
    }

    public static void main(String[] args) {
        int[][] grid = {
            { 0, 0, 0 },
            { 0, 1, 0 },
            { 0, 0, 0 }
        };

        System.out.println(uniquePathsWithObstacles(grid)); // Output: 2
    }
}
