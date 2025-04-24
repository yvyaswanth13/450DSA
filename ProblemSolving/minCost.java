// https://studyx.ai/homework/105497289-2-question-2-there-exist-n-microservices-each-with-a-specific-number-of-running-pods
import java.io.*;
import java.util.*;

public class Solution {
  static  int mincost(int pods[],int costs[] )
    {
        int min=0;
        List<int[]> list= new ArrayList<int[]>() ;
        for(int i=0;i<pods.length;i++)
        list.add(new int []{pods[i],costs[i]});
           list.sort((a,b)->a[0]-b[0]);
           HashSet<Integer> set= new HashSet<>();
           for(int arr[]:list)
           {
            int pod=arr[0];
            int cost =arr[1];
           while(set.contains(pod))
           {
            pod++;
            min=min+cost;
           }
           set.add(pod);
           }
           return min;
          
          
        
    }

    public static void main(String[] args) {
          int[] pods = {2, 3,2,1};
        int[] cost = {1,2, 1, 3};
        /*2 3 2 1 _>1 2 2 3 
          1 2 1 3 _>3 1 1 2 */

        int result = mincost(pods, cost);
        System.out.println("Minimum total cost: " + result);  // Output: 3
    }
}
