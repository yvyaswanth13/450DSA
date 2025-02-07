// Java Code to find unique paths with obstacles O(m*n)-TC O(m*n)-SC (same as memo)
// using tabulation
class GfG {

    static int uniquePathsWithObstacles(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        
        // Initialize DP table with zeros
        int[][] dp = new int[r][c];

        // Initialize starting cell if 
          // there's no obstacle
        if(grid[0][0] == 0) {
            dp[0][0] = 1;
        }

        // Fill the DP table
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
              
                // If cell has an obstacle, set
                  // paths to 0
                if(grid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                  
                    // Accumulate paths from top cell
                    if(i > 0) dp[i][j] += dp[i-1][j];
                  
                    // Accumulate paths from left cell
                    if(j > 0) dp[i][j] += dp[i][j-1];
                }
            }
        }

        // Return paths count for the 
          // bottom-right cell
        return dp[r-1][c-1];
    }

    public static void main(String[] args) {
      
        int[][] grid = { { 0, 0, 0 },
                         { 0, 1, 0 },
                         { 0, 0, 0 } };

        System.out.println(uniquePathsWithObstacles(grid));
    }
}
