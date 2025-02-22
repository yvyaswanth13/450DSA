//https://www.geeksforgeeks.org/problems/minimize-the-heights-i/1
class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
       Arrays.sort(arr);
        int n=arr.length;
        int min =arr[0]+k;
        int max= arr[n-1]-k;
       int mi=0;
       int ma=0;
       //int diff=0;
       int ans=arr[n-1]-arr[0];
       
       for(int i=0;i<n-1;i++)
       {
            mi=Math.min(arr[i+1]-k,min);
          ma=Math.max(arr[i]+k,max);
           
         /*  if(mi<0)
           continue;*/
           
           //diff=ma-mi;
           
           ans=Math.min(ans,ma-mi);
           
       }
        
        return ans;
    }
}
