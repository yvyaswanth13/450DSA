// Merge sort in Java Divide and conqure

class MergeSort {

  // Merge two subarrays L and M into arr
  void merge(int arr[], int p, int q, int r) {

    int n1 = q - p + 1;
    int n2 = r - q;

    int L[] = new int[n1];
    int M[] = new int[n2];

    for (int i = 0; i < n1; i++)
      L[i] = arr[p + i];
    for (int j = 0; j < n2; j++)
      M[j] = arr[q + 1 + j];

    // Maintain current index of sub-arrays and main array
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    // Until we reach either end of either L or M, pick larger among
    // elements L and M and place them in the correct position at A[p..r]
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    // When we run out of elements in either L or M,
    // pick up the remaining elements and put in A[p..r]
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide the array into two subarrays, sort them and merge them
  void mergeSort(int arr[], int l, int r) {
    if (l < r) {

      // m is the point where the array is divided into two subarrays
      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      // Merge the sorted subarrays
      merge(arr, l, m, r);
    }
  }

  // Print the array
  static void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }

  // Driver program
  public static void main(String args[]) {
    int arr[] = { 6, 5, 12, 10, 9, 1 };

    MergeSort ob = new MergeSort();
    ob.mergeSort(arr, 0, arr.length - 1);

    System.out.println("Sorted array:");
    printArray(arr);
  }
}
Certainly! Let's break down the calculation of n1, n2, and the use of p + i and q + 1 + j in the merge method:

Context of the Merge Function
The merge function is typically used in the Merge Sort algorithm to merge two sorted subarrays into a single sorted array. The function takes four arguments:

arr[]: the main array being sorted.

p, q, r: the indices that represent the boundaries of the subarrays in arr[].

The subarray arr[p...q] is the first subarray.

The subarray arr[q+1...r] is the second subarray.

We need to merge these two sorted subarrays into a sorted array.

Calculation of n1 and n2
n1 is the size of the first subarray arr[p...q]:

The subarray starts at index p and ends at index q.
So the number of elements in this subarray is q - p + 1.
q - p gives the number of elements from p to q (inclusive of q).
Adding 1 accounts for the fact that both p and q are inclusive indices.
n2 is the size of the second subarray arr[q+1...r]:

The subarray starts at index q + 1 and ends at index r.
The number of elements in this subarray is r - q.
r - q gives the number of elements from q+1 to r (inclusive of r).
Explanation of p + i and q + 1 + j
L[i] = arr[p + i]:

This line copies elements from the first subarray arr[p...q] into the temporary array L[].
The variable i is the index in the L[] array, and p + i is the corresponding index in the original array arr[].
p is the starting index of the first subarray.
By adding i, you correctly index the elements from the first subarray: arr[p], arr[p+1], arr[p+2], etc.
For example, if p = 2 and n1 = 3, then the elements of arr[2], arr[3], and arr[4] will be copied to L[0], L[1], and L[2].
M[j] = arr[q + 1 + j]:

This line copies elements from the second subarray arr[q+1...r] into the temporary array M[].
The variable j is the index in the M[] array, and q + 1 + j is the corresponding index in the original array arr[].
q + 1 is the starting index of the second subarray (just after the first subarray).
By adding j, you correctly index the elements from the second subarray: arr[q+1], arr[q+2], arr[q+3], etc.
For example, if q = 4 and n2 = 3, then the elements of arr[5], arr[6], and arr[7] will be copied to M[0], M[1], and M[2].
