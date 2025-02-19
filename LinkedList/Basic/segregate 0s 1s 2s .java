https://www.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions
  static Node segregate(Node head) {
        // add your code here
        Node zeroD =new Node(-1);
        Node oneD =new Node(-1);
        Node twoD =new Node(-1);
         Node zero = zeroD, one = oneD, two = twoD;
         
        Node curr=head;
        while(curr!=null)
        {
            if(curr.data==0)
            {
                zero.next=curr;
                zero=zero.next;
                
            }
            else if(curr.data==1)
            {
                one.next=curr;
                one=one.next;
            }
            else{
                two.next=curr;
                two=two.next;
            }
            curr=curr.next;
        }
        
        if(oneD.next!=null)
        {
            zero.next=oneD.next;
        }
        else 
        {
             zero.next=twoD.next;
        }
        one.next=twoD.next;
        
        two.next=null;
      
        return zeroD.next;
    
    }
 i/p :1 2 2 1 2 0 2 2  
o/p: 0 1 1 2 2 2 2 2
