static Node rightRotate(Node head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head; // Edge cases: empty list, single node, or no rotation needed
    }

    // Step 1: Compute the length of the list
    Node curr = head;
    int len = 1; // Start from 1 because we are already at head
    while (curr.next != null) {
        curr = curr.next;
        len++;
    }

              // Step 2: Reduce k to avoid unnecessary full rotations
    k = k % len;
    if (k == 0) return head; // If k == 0, no rotation needed

    // Step 3: Make it circular by connecting last node to head
    curr.next = head;

    // Step 4: Traverse to the (N-k)th node (new tail)
    Node newTail = head;
    for (int i = 1; i < len - k; i++) { // Stop at (N-k)th node
        newTail = newTail.next;
    }

    // Step 5: New head is (N-k+1)th node
    Node newHead = newTail.next;
    newTail.next = null; // Break the circular connection

    return newHead;
}
