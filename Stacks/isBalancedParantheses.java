
class Solution {
    /*
    Input: s = "[()()]{}"
Output: true*/
    static boolean isBalanced(String s) {
        // code here
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='{'||c=='['||c=='(')
            {
                
                st.push(c);
            }
             
             else{
                 if(st.isEmpty())
                 return false;
             
              char top=st.pop();
                    if(c=='}' && top!='{'||c==']' && top!='['|| c==')' && top!='(')
                    {
                        return false;
                    }
             }
            
        }
        
        return st.isEmpty();
       
    }
}
