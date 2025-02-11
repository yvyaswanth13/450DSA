import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeKSortedLists {
    static Node mergeKSortedList(List<Node> arr, int K) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));
        
        for (Node a : arr) {
            if (a != null) { // Avoid adding null nodes
                pq.add(a);
            }
        }
        
        Node dummy = new Node(-1);
        Node curr = dummy;
        
        while (!pq.isEmpty()) {
            Node top = pq.poll();
            curr.next = top;
            curr = top;
            
            if (top.next != null) {
                pq.add(top.next);
            }
        }
        
        return dummy.next;
    }
}
