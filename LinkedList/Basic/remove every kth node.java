// Java program to delete every k-th Node of
// a singly linked list.
class Node {
    int data;
    Node next;

    Node(int newData) {
        data = newData;
        next = null;
    }
}

public class GfG {
  
    // Function to remove every kth node in the
    // linked list
    static Node deleteK(Node head, int k) {
      
        // If list is empty or k is 0, return the head
        if (head == null || k <= 0)
            return head;

        Node curr = head;
   
        Node prev = null;
      
        int count = 1;

        // Traverse the linked list
        while (curr != null) {
           prev = curr;
          
            // Increment the counter for each node
            count++;
			curr = curr.next;
           
            if (count % k == 0) {
              
                // skip the current node
                if (curr != null) {
                    prev.next = curr.next;
                } 
               else {
                 
                    // If removing the head node(not sure)
                    head = curr.next;
                }
            } 
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
      
        // Create a hard-coded linked list: 
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int k = 3;

        head = deleteK(head, k);

        printList(head); // 1 2 4 5 
    }
}
