class MinHeap{
    int heap[];
    int size;
    
    MinHeap(int cap)
    {
        heap=new int[cap];
        size=0;
    }
    void minHeapiy(int i)
    {
        int l=2*i+1;
        int r=2*i+2;
        int small=i;
        if(l< size && heap[l]<heap[i] )
        small=l;
        if(r< size && heap[r]<heap[i] )
        small=r;
        
        if(i!=small)
        {
            swap(i, small);
            minHeapiy(small);
        }
        
    }
    void swap(int i, int j)
    {
        int temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    void add(int n)
    {
        heap[size]=n;
        int i=size++;
        
        
        while(i<size && heap[i]<heap[(i-1)/2])
        {
            swap(i,(i-1)/2);
            i=i-(i-1)/2;
        }
    }
    int extractMin(){
        
        if(size<0)
       {
        return -1;
       }
        int ans=heap[0];
        heap[0]=heap[size-1];
          size--;
      
      
        minHeapiy(0);
        return ans;
    }
    void print()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(heap[i] +" ,");
        }
    }
    
}
public class Solution {
    

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        MinHeap min =new MinHeap(30);
        min.add(2);
        min.add(5);
        min.add(3);
        min.add(9);
        min.print();
        System.out.println();
        System.out.println(min.extractMin());
        min.print();
        
    }
}
