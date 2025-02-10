import java.util.*;
public class Solution {

   static String longestUniqSubstrin(String str)
    {
        //boolean []vis= new boolean[26];
        HashSet<Character> s= new HashSet<>();
        int left=0;
        int right=0;
        int res=0;
        int start=0;
        int end=0;
        
      while(right<str.length())
        {
            while(s.contains(str.charAt(right)))
            {
                s.remove(str.charAt(left));
              //  vis[str.charAt(left)-'a']=false;
                left++;
                
            }
            s.add(str.charAt(right));
           // vis[str.charAt(right)-'a']=true;
            end=right-left+1;
            if(end>res)
            {
                res=end;
            }
          //  res=Math.max(res,right-left+1);
            right++;
            
        }
        return str.substring(left, left + res);
    }
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        System.out.println(longestUniqSubstrin("ab##ad"));
    }
}
