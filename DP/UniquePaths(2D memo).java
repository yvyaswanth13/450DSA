// Java code to find number of unique paths
// using Memoization
import java.util.*;

class GfG {

    // Helper function to find unique paths 
    // recursively with memoization
    static int UniquePathHelper(int i, int j, int r, int c, 
                                       int[][] grid, int[][] memo) {
        // If out of bounds, return 0
        if(i == r || j == c) {
            return 0;
        }

        // If cell is an obstacle, return 0
        if(grid[i][j] == 1) {
            return 0;
        }
        
        // If reached the bottom-right cell,
          // return 1
        if(i == r-1 && j == c-1) {
            return 1;
        }

        // If value is already computed, return it
        if(memo[i][j] != -1) {
            return memo[i][j];
        }

        // Memoize the result of recursive calls
        memo[i][j] = UniquePathHelper(i+1, j, r, c, grid, memo) + 
                     UniquePathHelper(i, j+1, r, c, grid, memo);

        return memo[i][j];
    }

    // Function to find unique paths with obstacles
    static int uniquePathsWithObstacles(int[][] grid) {
      
        int r = grid.length, c = grid[0].length;
        int[][] memo = new int[r][c];
        for (int[] row : memo) Arrays.fill(row, -1);
        return UniquePathHelper(0, 0, r, c, grid, memo);
    }

    public static void main(String[] args) {
        int[][] grid = { { 0, 0, 0 },
                         { 0, 1, 0 },
                         { 0, 0, 0 } };

        System.out.println(uniquePathsWithObstacles(grid));
    }
}
