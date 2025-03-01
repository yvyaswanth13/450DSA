//watch jenny lecture and java made easy book -522 pg
class Solution {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
       int pivot;
        if(low<high)
        {
       pivot =partition(arr,low,high);
       // System.out.println(pivot);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high); // why pivot +1 insted of (pivot,high) 
        //After partitioning, the pivot is already in its correct position, so we do not need to sort it again.will do from pivot+1
        }
        
        
    }
//5(lo) 4 2 3(r) 6 7 --3 4 2 5 6 7
//2 3 4 5 6 7
    static int partition(int arr[], int low, int high) {
        // your code here
        int left=low;
        int right=high;
        
        int pivot_d=arr[low];
      while(left<right)
      {
        while(left < right && arr[left]<=pivot_d)
        left++;
        
        while(arr[right]>pivot_d)
        right--;
      
        if(left<right)
        {
            swap(arr, left, right); // {6, 2, 8, 4, 1, 9}; then you will understand
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
