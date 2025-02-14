// Java Program to find the max profit when multiple
// transactions are allowed

import java.util.Arrays;

class GfG {
    
    static int maximumProfit(int[] prices) {
        int res = 0;

        // Keep on adding the difference between
        // adjacent when the prices a
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i + 1]) 
                res += prices[i+1] - prices[i];
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] prices = { 100, 180, 260, 310, 40, 535, 695 };
        System.out.println(maximumProfit(prices));
    }
}
