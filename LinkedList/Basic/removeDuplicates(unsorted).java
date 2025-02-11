// Java implementation to remove duplicates from
// an unsorted singly linked list using hashing

import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    static Node removeDuplicates(Node head) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node curr = head;
        Node prev = null;

        while (curr != null) {
          
            // Check if the element is already in the hash table
            if (hashSet.contains(curr.data)) {
              
                // Element is present, remove it
                prev.next = curr.next;
            } else {
              
                // Element is not present, add it to hash table
                hashSet.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
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
      
        // Create a singly linked list:
        // 12 -> 11 -> 12 -> 21 -> 41 -> 43 -> 21
        Node head = new Node(12);
        head.next = new Node(11);
        head.next.next = new Node(12);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(41);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(21);

        head = removeDuplicates(head);
        printList(head);
    }
}
