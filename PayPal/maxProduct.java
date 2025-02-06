public class Solution {
    static int maxProduct(int arr[])
    {
        //left to right & 
        int ans=1;
        int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans*arr[i];
            if(ans>maxpro)
            {
                maxpro=ans;
            }
            if(ans==0)
            {
                ans=1;
            }
        }
        //right to left
        ans = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans *= arr[i];
            maxpro = Math.max(maxpro, ans);
            if (ans == 0) ans = 1; // Reset on zero
        }
        return maxpro;
    }

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
         int arr[] = { -2, 6, -3, -10, 0, 2 };
        System.out.println(maxProduct(arr));//180
    }
}
