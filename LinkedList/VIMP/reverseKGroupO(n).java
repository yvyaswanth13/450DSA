// Java program to reverse a linked list in groups of
// given size

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

// Helper function to reverse K nodes
class GfG {

    static Node reverseKNodes(Node head, int k) {
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;

        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        return prev;
    }

    // Recursive function to reverse in groups of K
    static Node reverseKGroup(Node head, int k) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        Node groupHead = reverseKNodes(head, k);
        
        // Recursion for the next group
        head.next = reverseKGroup(temp, k);

        return groupHead;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Creating a sample singly linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        head = reverseKGroup(head, 3);
        printList(head);
    }
}
