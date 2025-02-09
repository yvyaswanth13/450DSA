// Java program to implement
// unbounded knapsack problem using recursion.

class GfG {

    static int knapSackRecur(int i, int capacity, int[] val, int[] wt) {
       
      if (i < 0) return 0;

        // Consider current item only if 
        // its weight is less than equal 
        // to maximum weight.
        int take = 0;
        if (wt[i] <= capacity) {
            take = val[i] + knapSackRecur(i, capacity - wt[i], val, wt);
        }

        // Skip the current item
        int noTake = knapSackRecur(i - 1, capacity, val, wt);

        // Return maximum of the two.
        return Math.max(take, noTake);
    }

    static int knapSack(int capacity, int[] val, int[] wt) {
        return knapSackRecur(wt.length-1, capacity, val, wt);
    }

    public static void main(String[] args) {
        int[] val = {1, 1};
        int[] wt = {2, 1};
        int capacity = 3;
        System.out.println(knapSack(capacity, val, wt));   3 
    }
}
