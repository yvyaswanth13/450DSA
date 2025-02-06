N= 2^d -1
N=no.of Nodes
d=depth of tree
 d=h+1 (h= height)

 no.of edege+1 =depth(height)
        1  <- Depth 0
      / \
     2   3  <- Depth 1
    / \
   4   5  <- Depth 2
------------------------------
       1  <- Level 1
      / \
     2   3  <- Level 2
    / \
   4   5  <- Level 3


class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

class GfG {

    // Function to find depth (height in nodes)
    static int depth(Node root) {
        if (root == null)
            return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    // Function to count total nodes
    static int totalNodes(Node root) {
        if (root == null)
            return 0;
        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }

    // Function to check if tree is perfect
    static boolean isPerfect(Node root) {
        int d = depth(root); // Height in nodes
        int N = totalNodes(root);
        
        // Check the perfect tree condition
        return N == Math.pow(2, d) - 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(isPerfect(root)); // Output: true
    }
}
