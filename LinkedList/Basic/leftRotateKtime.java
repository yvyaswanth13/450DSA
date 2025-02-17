class Solution {
    public Node rotate(Node head, int k) {
        // add code here
        Node curr= head;
        Node prev=null;
        int len=1; //count curr head and start from curr.next or you can use prev
        // eith len =0 & while(curr!=null)
        
        while(curr.next!=null)
        {
            len++;
           // prev=curr;
            curr=curr.next;
        }
      
       
         k=k%len;
         if (k == 0) return head;
         
        curr.next =head;   // make it circular      // prev.next =head;
        Node newTail=head;
        
        for(int i=1;i<k;i++)
        {
            newTail=newTail.next;
        }
        Node newHead =newTail.next; //update head(k+1) then you need that tail as null otherwise infinite
        
        newTail.next=null;
        
        return newHead;
    }
}
