Steps
Step 1: Reverse the Linked List
This allows us to add 1 starting from the least significant digit (LSD) (rightmost digit), 
just like how addition works in arithmetic.
Step 2: Traverse the List and Add 1
Add 1 to the first node (LSD).
If the sum is less than 10, set carry = 0 and stop.
If the sum is 10 or more, set data = 0 and carry over 1 to the next node.

Step 3: Reverse the List Again
This restores the original order while keeping the updated number.
  Step 4: If Carry ==1 create a new node(1) with one and add nextto new node and reurn new node else head(means carry==0)

class Solution {
    
    public Node rev(Node head)
    {
        
        
        Node curr=head;
        Node next;
       Node prev=null;
        
        while(curr!=null)
        {
         
        next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;   
        }
        
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head= rev(head);
        Node curr=head;
        int carry=1;
        
      
        while(curr!=null)
        {
           
           curr.data=curr.data+carry;
           if(curr.data<10)
           {
               carry=0;
               break;
           }
           else
           {
               curr.data=0;
               carry=1;
           }
            
            curr=curr.next;
        }
        
        head=rev(head);
        if(carry==1)
        {
            Node node= new Node(1);
            node.next=head;
            return node;
        }
        
        
        return head;
        
    }
}
