
// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

You will get actual mi and ma and you wiull compare with them other do we have any other elements in array that give min diff b/w min and max by mdodifing with +m and -m 

max( if we do + here we may not archive Min diff : 
you have min =1 and next elemet is 10 then if you do 10+2=12 dif=12-1(min)=9 in case of -> " -" 10-2(m=2)=8 and min=1 8-1 =7. So,7 < 8;
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
