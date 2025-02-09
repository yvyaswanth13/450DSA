class RodCutting {
    public static int fun(int[] arr, int ind, int N) {
        if (ind == 0) return N * arr[0]; // 0 index also can use to cut rod with arr[0] value;

        int nottake = fun(arr, ind - 1, N);
        int take = Integer.MIN_VALUE;
        int rodlength = ind + 1;

        if (rodlength <= N) {
            take = arr[ind] + fun(arr, ind, N - rodlength);
        }

        return Math.max(take, nottake);
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 9, 10, 17, 17, 20}; 
        int N = arr.length; // Total length of the rod
        int n = N - 1; // Last index for recursion

        int maxProfit = fun(arr, n, N);
        System.out.println("Maximum Profit: " + maxProfit);//22
    }
}
