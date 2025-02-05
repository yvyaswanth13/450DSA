// Java program to search an element in sorted and rotated 
// array using binary search
check left is part is sorted ifyes go and check x >=arr[left] and x<=arr[mid] ? right/hi=mid-1: lef=mid+1;
else
x <=arr[right] and x>arr[mid] ?  lef=mid+1 :right/hi=mid-1;
--------------------------------------------------------------------
import java.util.*;
class GfG {
  
    static int search(int[] arr, int key) {
      
      
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            
            if (arr[mid] == key)
                return mid;

            // If Left half is sorted -------VVVVVIMP
            if (arr[mid] >= arr[lo]) {
              
                // If the key lies within this sorted half,
                // move the hi pointer to mid - 1
                if (key >= arr[lo] && key < arr[mid])
                    hi = mid - 1;
              
                // Otherwise, move the lo pointer to mid + 1
                else
                    lo = mid + 1;
            }
          
            // If Right half is sorted
            else {
              
                if (key > arr[mid] && key <= arr[hi])
                    lo = mid + 1;
              
                else
                    hi = mid - 1;
            }
        }
      
        // Key not found
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key1 = 3;
        System.out.println(search(arr1, key1));
    }
}
