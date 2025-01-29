
// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
import java.util.* ;
import java.io.*; 

public class Solution {

    public static int minimizeIt(int[] A, int K) {
        // Write your code here.
        Arrays.sort(A);
        int n=A.length;
        int ans=A[n-1]-A[0];
        int mi=A[0]+K;
        int ma=A[n-1]-K;
        int diff,min,max;

        for(int i=0;i<n-1;i++)
        {
            min=Math.min(A[i+1]-K,mi);
            max=Math.max(A[i]+K,ma);
            if(min<0)
            {
            continue;
            }
            diff=max-min;
            ans=Math.min(ans,diff);

        }
        
        return ans;

    }
}
