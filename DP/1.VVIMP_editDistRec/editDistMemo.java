import java.util.*;
public class Solution {
      static int editDistRec(String s1, String s2, int m, int n,int memo[][]) {
        
        if (m == 0) return n;

       
        if (n == 0) return m;
        
        if(memo[m][n]!=-1)
        return memo[m][n];

       
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
        {
            memo[m][n]= editDistRec(s1, s2, m - 1, n - 1,memo);
            return memo[m][n];
        }
            
        
        memo[m][n]=  1 + Math.min(Math.min(editDistRec(s1, s2, m, n - 1,memo),    // Insert
                                      editDistRec(s1, s2, m - 1, n,memo)),  // Remove
                             editDistRec(s1, s2, m - 1, n - 1,memo));     // Replace
   return memo[m][n];
    }

  
    public static int editDist(String s1, String s2) {
        int n=s2.length();
        int m=s1.length();
        int memo[][] = new int[m+1][n+1];
        for(int row[]:memo)
        {
            Arrays.fill(row,-1);
        }
        
        
        return editDistRec(s1, s2, s1.length(), s2.length(),memo);
    }

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
                String s1 = "GEEXSFRGEEKKS";
        String s2 = "GEEKSFORGEEKS";
        System.out.println(editDist(s1, s2));

    }
}
