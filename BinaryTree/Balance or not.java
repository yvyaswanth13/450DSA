// Java program to check if a tree is height-balanced or not 
// Using Bottom Up Recursion
// YOu have to check for all left and right sub trees. if you find any of is not balance means abs(lh-rh)<=1 else return -1 

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class GfG {
  
    // Function that returns the height of the tree if the tree is balanced
    // Otherwise it returns -1
    static int isBalancedRec(Node root) {
      
        // Base case: Height of empty tree is zero
        if (root == null)
            return 0;

        // Find Heights of left and right subtrees
        int lHeight = isBalancedRec(root.left);
        int rHeight = isBalancedRec(root.right);

        // If either of the subtrees are unbalanced or the absolute difference  
        // of their heights is greater than 1, return -1
        if (lHeight == -1 || rHeight == -1 || Math.abs(lHeight - rHeight) > 1)
            return -1;

        // Return the height of the tree
        return Math.max(lHeight, rHeight) + 1;
    }

    // Function to check if the tree is height balanced
    static boolean isBalanced(Node root) {
        return isBalancedRec(root) > 0;
    }

    public static void main(String[] args) {
        // Representation of input BST:
        //            1
        //           / \
        //          2   3
        //         /  \
        //        4   5 
        //       /
        //      8
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(8);

        System.out.println(isBalanced(root) ? "True" : "False");
    }
}
