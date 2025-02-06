// Recursive Java program to check if two
// roots are mirror images of each other
class Node {
    int data;
    Node left, right;
  
    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class GfG {
    
    // Function to check if two roots are mirror images
    static boolean areMirrors(Node root1, Node root2) {
        
        // If both roots are empty, they are mirrors
        if (root1 == null && root2 == null) {
            return true;
        }
        
        // If only one root is empty, they are not mirrors
        if (root1 == null || root2 == null) {
            return false;
        }
        
        // Check if the root data is the same and
        // if the left subroot of root1 is a mirror 
        // of the right subroot of root2 and vice versa
        return (root1.data == root2.data) &&
               areMirrors(root1.left, root2.right) &&
               areMirrors(root1.right, root2.left);
/* for Identical
return (r1.data == r2.data) &&
               isIdentical(r1.left, r2.left) &&
               isIdentical(r1.right, r2.right);  
  
  */
    }

    public static void main(String[] args) {
        
        // Representation of input binary tree 1
        //        1
        //       / \
        //      3   2
        //          / \
        //         5   4
        Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);

        // Representation of input binary tree 2 (mirror)
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);

        if (areMirrors(root1, root2)) {
            System.out.println("true");
        } 
        else {
            System.out.println("false");
        }
    }
}
