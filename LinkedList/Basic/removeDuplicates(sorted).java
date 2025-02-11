class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
  
    // Function to remove duplicates from a sorted linked list
    static Node removeDuplicates(Node head) {
        Node curr = head;

        // Traverse the list
        while (curr != null && curr.next != null) {
            // Check if next value is the same as curr
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next; // Skip duplicate node
            } else {
                curr = curr.next; // Move to next distinct node
            }
        }
        return head;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
      
        // Create a sorted linked list:
        // 11->11->11->13->13->20
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(13);
        head.next.next.next.next = new Node(13);
        head.next.next.next.next.next = new Node(20);

        System.out.println("Linked list before duplicate removal:");
        printList(head);

        head = removeDuplicates(head);

        System.out.println("Linked list after duplicate removal:");
        printList(head);
    }
}
