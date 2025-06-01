//https://www.geeksforgeeks.org/problems/minimize-the-heights3351/1

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        
        int ans= arr[n-1]-arr[0];
        
        int min= arr[0]+k;
        int max=arr[n-1]-k;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            continue;
            // reason abv condition->After the operation, the resultant array should not contain any negative integers. 
            
            int mi= Math.min(min,arr[i]-k);
            int ma= Math.max(max,arr[i-1]+k);
            
            ans=Math.min(ans,ma-mi);
        }
        return ans;
    
    }
}
