// Function to rotate the linked list right by k positions
static Node rightRotate(Node head, int k) {
    if (head == null || head.next == null || k == 0) {
        return head; // Edge case: empty list, single node, or no rotation needed
    }

    // Find length of the list
    Node curr = head;
    int len = 0;
    while (curr != null) {
        len++;
        curr = curr.next;
    }

    // Reduce k if it's greater than length
    k = k % len;
    if (k == 0) return head; // No need to rotate if k is 0 or k == length

    // Find (N-k)th node
    Node prev = head;
    for (int i = 1; i < len - k; i++) { // Stop at (N-k)th node
        prev = prev.next;
    }

    // New head is (N-k+1)th node
    Node newHead = prev.next;
    prev.next = null; // Break the link

    // Move to the last node
    Node last = newHead;
    while (last.next != null) {
        last = last.next;
    }

    // Connect last node to old head
    last.next = head;

    return newHead;
}
