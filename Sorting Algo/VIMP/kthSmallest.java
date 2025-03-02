class Solution {
    public static int kthSmallest(int[] arr, int k) {
       
       int res =quickSort(arr,0,arr.length-1,k);
       return res;
       
}
 static int quickSort(int arr[], int low, int high,int k) {
        // code here
        
        if(low==high)
        {
           return arr[low]; 
        }
        int pivot=partition(arr,low,high);//4
      //  System.out.println(pivot);
       
        int rank=pivot-low+1;
        if(rank==k)
        {
          return arr[pivot];
        }
        
        else if(rank>k)
        return quickSort(arr,low,pivot-1,k);
        
       else return quickSort(arr,pivot+1,high,k-rank); // Best Ex: 4 2 3 5 1 6;-> 1 2 3 4 5 6
       
        
}
 static int partition(int arr[], int low, int high) {
        // your code here
        int left=low;
        int right=high;
        
        int pivot_d=arr[low];
      while(left<right)
      {
        while(left<right &&arr[left]<=pivot_d)
        left++;
        
        while(arr[right]>pivot_d)
        right--;
        
       if(left<right)
        {
            swap(arr, left, right);
        }
       
      }  
        
        arr[low]=arr[right];
        arr[right]=pivot_d;
      
        return right;
    
    }
    static void swap(int arr[], int low,int right)
    {
        int t=arr[low];
        arr[low]=arr[right];
        arr[right]=t;
        
    }

}
