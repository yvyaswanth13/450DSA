import java.util.*;

public class Solution {

public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
    // Write your code here.
    if(intervals.size()==1)
    return intervals;
    ArrayList<Interval> in= new ArrayList<Interval>();
   //  intervals.sort(Comparator.comparingInt(a -> a.start));
   Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
    in.add(intervals.get(0));



    for(int i=1;i<intervals.size();i++)
    {
        Interval lastmerged=in.get(in.size()-1);
        Interval curr=intervals.get(i);
        if(curr.start<=lastmerged.end)
        {
            lastmerged.end=Math.max(lastmerged.end,curr.end);

        }
        else
        {
            in.add(curr);
        }
       
    }
    return in;
    }
}
