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
