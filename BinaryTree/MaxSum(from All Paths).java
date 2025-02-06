class GfG {
    // Global variable for storing the max sum
    static int mxSum = Integer.MIN_VALUE;

    static void findMaxSum(Node root, int currSum) {
        if (root == null) 
            return;

        // Add the current node's data to the path sum
        currSum += root.data;

        // If leaf node, update the max sum
        if (root.left == null && root.right == null) {
            if (currSum > mxSum) {
                mxSum = currSum;
            }
        }

        // Recursive calls for left and right subtrees
        findMaxSum(root.left, currSum);
        findMaxSum(root.right, currSum);
    }

    static int maxPathSum(Node root) {
        if (root == null)
            return 0;

        // Initialize max sum as the smallest possible integer
        mxSum = Integer.MIN_VALUE;

        // Start the recursive process
        findMaxSum(root, 0);

        return mxSum;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(7);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);

        int sum = maxPathSum(root);
        System.out.println(sum);
    }
}
