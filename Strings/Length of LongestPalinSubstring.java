class Solution {
    
    int lcs(String s1, String s2,int i,int j)
    {
        if(i<0|| j<0)
        return 0;
        
        if(s1.charAt(i)==s2.charAt(j))
        {
            
            
            return 1+lcs(s1,s2,i-1,j-1);
        }
        else
        {
            
        return Math.max(lcs(s1,s2,i,j-1),lcs(s1,s2,i-1,j));
        }
    }
    
    static String longestPalindrome(String s) {
        // code here
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        
        return lcs(s,sb.toString(),s.length(),sb.length());
        
        
    }
}
