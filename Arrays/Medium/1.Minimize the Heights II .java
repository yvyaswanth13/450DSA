//https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

class Solution {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        
        int n=arr.length;
        int ans=arr[n-1]-arr[0];
        int min =arr[0]+k;
        int max= arr[n-1]-k;
       
        if (min > max) { // Ensure min is actually smaller
            int temp = min;
            min = max;
            max = temp;
        }
       
       
       
       for(int i=1;i<n;i++)
       {
         int  mi=Math.min(arr[i]-k,min);
          int ma=Math.max(arr[i-1]+k,max);
           if(mi<0)
           continue;
           
           
           ans=Math.min(ans,ma-mi);
           
       }
        
        return ans;
    }
}
