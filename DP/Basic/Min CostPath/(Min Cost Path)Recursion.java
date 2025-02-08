// Java implementation to find the minimum cost path
// using Recursion
import java.util.ArrayList;
import java.util.List;

class GfG {

    // Function to return the cost of the minimum cost path
    // from (0,0) to (m, n) in a cost matrix
    static int minCost(List<List<Integer>> cost, int m, int n) {
      
        // If indices are out of bounds, return a large value
        if (m < 0 || n < 0) {
            return Integer.MAX_VALUE;
        }
        // Base case: starting cell
        if (m == 0 && n == 0) {
            return cost.get(m).get(n);
        }

        // Recursively calculate minimum cost from
        // all possible paths curr position is 2,2
        return cost.get(m).get(n) + Math.min(
                Math.min(minCost(cost, m, n - 1),//left
                         minCost(cost, m - 1, n)),//right
                minCost(cost, m - 1, n - 1));//diadonal 3->8(2,2->1,1)
    }

    public static void main(String[] args) {
      
        List<List<Integer>> cost = new ArrayList<>();
        cost.add(new ArrayList<>(List.of(1, 2, 3)));
        cost.add(new ArrayList<>(List.of(4, 8, 2)));
        cost.add(new ArrayList<>(List.of(1, 5, 3)));
      
        int m = cost.size();
        int n = cost.get(0).size();
        System.out.println(minCost(cost, m-1, n-1));
    }
}
