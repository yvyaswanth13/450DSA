
static boolean searchWithDuplicates(int[] arr, int key) {
    int lo = 0, hi = arr.length - 1;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;

        if (arr[mid] == key)
            return true;

        // If we can't determine the sorted half due to duplicates
        if (arr[lo] == arr[mid] && arr[mid] == arr[hi]) {
            lo++;
            hi--;
        }

        // Left half is sorted
        else if (arr[lo] <= arr[mid]) {
            if (key >= arr[lo] && key < arr[mid])
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        // Right half is sorted
        else {
            if (key > arr[mid] && key <= arr[hi])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
    }

    return false;
}

arr = [2, 5, 6, 0, 0, 1, 2]
key = 0

→ Output: true

