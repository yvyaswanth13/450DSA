//whenever level change add first ele to ds or list
 void rightV(Node root,int lv,ArrayList<Integer> res)
     {
          if(root==null)
        return ;
        if(lv==res.size())
        res.add(root.data);
        
        rightV(root.right,lv+1,res);
        rightV(root.left,lv+1,res);
     }
//leftView
whenever level change add first ele to ds or list
void rightV(Node root,int lv,ArrayList<Integer> res)
     {
          if(root==null)
        return ;
        if(lv==res.size())
        res.add(root.data);
        
        
        rightV(root.left,lv+1,res);
  rightV(root.right,lv+1,res);
     }















class Solution {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> res= new ArrayList<>();
        int lv=0;
         rightV(root,lv,res);
        return res;
       
        
        // add code here.
    }
     void rightV(Node root,int lv,ArrayList<Integer> res)
     {
          if(root==null)
        return ;
        if(lv==res.size())
        res.add(root.data);
        
        rightV(root.right,lv+1,res);
        rightV(root.left,lv+1,res);
     }
}
