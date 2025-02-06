// Java program for level order traversal of Binary Tree
// Using Queue
import java.util.*;

class Node {
    int data;
    Node left, right;

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class GfG {
  
    // Iterative method to find height of Binary Tree
    static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();

        // Create an empty queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        // Enqueue Root
        q.add(root);
        int currLevel = 0;

        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                // Add front of queue and remove it from queue
                Node node = q.poll();
                res.get(currLevel).add(node.data);

                // Enqueue left child
                if (node.left != null)
                    q.add(node.left);

                // Enqueue right child
                if (node.right != null)
                    q.add(node.right);
            }
            currLevel++;
        }
        return res;
    }

    public static void main(String[] args) {
        // Create binary tree
        //      1         
        //     / \       
        //    3   2      
        //          \   
        //           4 
        //          /  \
        //         6    5
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.right.right = new Node(4);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);

        // Perform level order traversal
        ArrayList<ArrayList<Integer>> res = levelOrder(root);

        // Print the result
        for (ArrayList<Integer> level : res)
            for (int data : level)
                System.out.print(data + " ");
    }
}
