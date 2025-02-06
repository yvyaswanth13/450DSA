public class Solution {
    
    static List<Integer> nextGreater(int arr[])
     {
        List<Integer> res= new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            res.add(-1);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[j]>arr[i])
            {
              res.set(i, arr[j]);
               break;
               // arr[i]=arr[i+1];
            }
           
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(nextGreater(arr)); 
        //[5, 10, 10, -1, -1]
    }
}
