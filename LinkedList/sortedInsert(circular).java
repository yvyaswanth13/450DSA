https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions
 public Node sortedInsert(Node head, int data) {
        // code here
        Node curr= head;

        Node prev=null;
        Node newNode= new Node(data);
       if (data < head.data) 
       {

        while (curr.next != head)
        {
            curr = curr.next;
        }
        // Insert new node before head
        curr.next = newNode;
        newNode.next = head;
        
        return newNode;
         }
         
        //since circular do-while is best
        do{
        if(data<curr.data)
        {
           break;
        }
        prev=curr;
        curr=curr.next;
        }
        while(curr!=head);

        prev.next=newNode;
        newNode.next=curr;
        return head;
        
    }
