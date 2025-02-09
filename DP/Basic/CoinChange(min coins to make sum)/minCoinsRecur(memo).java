import java.util.* ;
import java.io.*; 
public class Solution {
     public static int minCoinsRecur(int i, int sum, int[] coins,int memo[][]) {
        int INF = (int) 1e9;  // A large value instead of Integer.MAX_VALUE

        // Base case: If sum is 0, no coins are needed
        if (sum == 0) return 0;

        // If no more coins are left or sum becomes negative, return a large value
        if (i == 0 || sum < 0) 
        return INF; 
        if(memo[i-1][sum]!=-1)
        {
            return memo[i-1][sum];
        }

        int take = Integer.MAX_VALUE;

        // Take the current coin (only if it's <= sum)
        if (coins[i-1] <= sum) { 
            take = 1 + minCoinsRecur(i, sum - coins[i-1], coins, memo); 
        }

        // Skip the current coin and move to the next
        int noTake = minCoinsRecur(i-1, sum, coins, memo); 

        memo[i-1][sum]=Math.min(take, noTake);
        return memo[i-1][sum];
    }


  
  public static int minimumElements(int num[], int x)  {
      int memo[][]= new int[num.length][x+1];
      for(int row[]:memo)
      {
          Arrays.fill(row,-1);
      }
        int ans = minCoinsRecur(num.length, x, num,memo); 
        return (ans >= (int) 1e9) ? -1 : ans; // If no valid way found, return -1
    }
 }

