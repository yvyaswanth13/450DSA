import java.util.*;

public class Solution {
    
    class Node {
        int key;
        int data;
        Node next;
        Node prev;
   
        Node(int key, int data) {
            this.key = key;
            this.data = data;
        }
    }

    class LRU {
        Map<Integer, Node> cache = new HashMap<>(); // Cache to store key-value pairs
        Node head = new Node(0, 0);  // Dummy head node
        Node tail = new Node(0, 0);  // Dummy tail node
        int cap;

        public LRU(int cap) {
            this.cap = cap;
            head.next = tail;
            tail.prev = head;
        }

        // Get method to return the data of the node
        public int get(int key) {
            if (!cache.containsKey(key)) {
                return -1;
            }
            Node node = cache.get(key);
            remove(node);
            insertToHead(node);
            return node.data;
        }

        // Put method to insert or update nodes
        public void put(int key, int data) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                remove(node);
                node.data = data;
                insertToHead(node);
            } else {
                if (cache.size() >= cap) {
                    Node tailPrev = tail.prev;
                    remove(tailPrev);
                    cache.remove(tailPrev.key); // Remove the key from the cache map
                }
                Node node = new Node(key, data);
                insertToHead(node);
                cache.put(key, node);
            }
        }

        // Insert the node right after the head
        private void insertToHead(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        // Remove a node from the doubly linked list
        private void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int cap = myObj.nextInt(); // Cache size
        int opsCount = myObj.nextInt(); // Number of operations

        // Create an LRU cache with the specified capacity
        LRU lru = new Solution().new LRU(cap);

        // Execute the operations
        for (int i = 0; i < opsCount; i++) {
            String operation = myObj.next(); // "put" or "get"
            int key = myObj.nextInt();  // Key
            if (operation.equals("put")) {
                int value = myObj.nextInt();  // Value to associate with the key
                lru.put(key, value);
            } else if (operation.equals("get")) {
                int result = lru.get(key);
                System.out.println(result);
            }
        }
    }
}

sample i/P:
3 7
put 1 10
put 2 20
put 3 30
get 2
put 4 40
get 1
get 3
o/p:
20
-1
30
Diagram Summary:

After put 1 10:
[Head] ↔ [1:10] ↔ [Tail]

After put 2 20:
[Head] ↔ [2:20] ↔ [1:10] ↔ [Tail]

After put 3 30:
[Head] ↔ [3:30] ↔ [2:20] ↔ [1:10] ↔ [Tail]

After get 2:
[Head] ↔ [2:20] ↔ [3:30] ↔ [1:10] ↔ [Tail]

After put 4 40 (Evict 1):
[Head] ↔ [4:40] ↔ [2:20] ↔ [3:30] ↔ [Tail]

After get 1 (Evicted):
[Head] ↔ [4:40] ↔ [2:20] ↔ [3:30] ↔ [Tail]

After get 3:
[Head] ↔ [3:30] ↔ [4:40] ↔ [2:20] ↔ [Tail]

