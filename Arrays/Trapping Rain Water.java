// https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1
class Solution {
    public int maxWater(int arr[]) {
        int prefix[]=new int[arr.length];
        int sufix[]=new int[arr.length];
       /* int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
           max= Math.max(arr[i],max);
            prefix[i-1]=max;
        }
        */
         int n=arr.length;
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = Math.max(prefix[i - 1], arr[i]);
        }
       
       /* max=arr[n-1];
       suffix[n-1]=arr[n-1];
         for(int i=n-2;i>0;i--)
        {
           suffix[i]= Math.max(suffix[i+1],arr[i]);
            sufix[n-1-i]=max;
        }*/
        sufix[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufix[i] = Math.max(sufix[i + 1], arr[i]);
        }
      
        
        int waterTrapped = 0;
        for (int i = 0; i < arr.length; i++) {
            // The water trapped at each position is the min of the left and right max heights minus the height at that position
            int min=Math.min(prefix[i], sufix[i]);
         //   System.out.println(sufix[i]+", "+prefix[i] +"->"+ min);
            int diff=min-arr[i];
          //  System.out.print(diff);
            waterTrapped += Math.min(prefix[i], sufix[i])-arr[i];
        }

        return waterTrapped;
        // code here
    }
}
