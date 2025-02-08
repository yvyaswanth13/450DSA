// Java code of finding Number of Unique
// BST and BT with N Keys
class GfG {

    // Function to calculate the binomial coefficient C(n, k)
    static int binomialCoeff(int n, int k) {
    if (k > n - k) k = n - k;  // Property: C(n, k) == C(n, n-k)

    int result = 1;
    for (int i = 1; i <= k; i++) {
        result = result * (n - i + 1) / i;  // Multiply and divide in one step
    }

    return result;
}


    // Function to find the nth Catalan number
    static int numBST(int n) {
      
        // Calculate C(2n, n)
        int c = binomialCoeff(2 * n, n);

        // Return the nth Catalan number
        return c / (n + 1);
    }

    // Function to find total binary tree
    static int numBT(int n) {
        int fact = 1;

        // Calculating factorial
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        // Total binary tree = Total binary search tree * n!
        return numBST(n) * fact;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(numBST(n));
        System.out.println(numBT(n));
    }
}
