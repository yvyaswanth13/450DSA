class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class GfG {

    // Function to swap data between two nodes
    static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    // Bubble Sort for Linked List
    static void sort(Node head) {
        if (head == null || head.next == null) return;

        boolean swapped;
        Node lastSorted = null; // Last sorted node (reduces iterations)

        do {
            swapped = false;
            Node curr = head;

            while (curr.next!=null && curr.next != lastSorted) {
                if (curr.data > curr.next.data) {
                    swap(curr, curr.next);
                    swapped = true;
                }
                curr = curr.next;
            }
            lastSorted = curr; // Move last sorted node
        } while (swapped);
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
        // Creating the linked list: 1 -> 7 -> 10 -> 4 -> 5 -> 6 -> NULL
        Node head = new Node(1);
        head.next = new Node(7);
        head.next.next = new Node(10);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        System.out.println("Before sorting:");
        printList(head);

        sort(head);

        System.out.println("After sorting:");
        printList(head);
    }
}
