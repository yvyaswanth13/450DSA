import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class BNode {
    int data;
    BNode left, right;

    BNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class LinkedListToBinaryTree {

    // Convert Linked List to Binary Tree
    static BNode convertLListToBtree(Node head) {
        if (head == null) return null;

        BNode root = new BNode(head.data);
        Queue<BNode> queue = new LinkedList<>();
        queue.add(root);

        Node curr = head.next;

        while (curr != null) {
            BNode parent = queue.poll();

            // Insert Left Child
            BNode leftChild = new BNode(curr.data);
            parent.left = leftChild;
            queue.add(leftChild);
            curr = curr.next;
            if (curr == null) break;

            // Insert Right Child
            BNode rightChild = new BNode(curr.data);
            parent.right = rightChild;
            queue.add(rightChild);
            curr = curr.next;
        }
        return root;
    }

    // Inorder Traversal for verification
    static void inorder(BNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        BNode root = convertLListToBtree(head);
        System.out.println("Inorder traversal of the constructed Binary Tree:");
        inorder(root); // Expected Output: 4 2 5 1 6 3 7
    }
}
