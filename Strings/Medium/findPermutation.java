/*if i/p is ABC
ABC 
ACB 
BAC 
BCA 
CAB
CBA
*/
class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        char []arr=s.toCharArray();
        
        ArrayList<String> res= new ArrayList<>();
        HashSet<String> uniquePermutations = new HashSet<>();//this will save time
        genPermutations(uniquePermutations,res,arr,arr.length-1);
        return res;
    }
    void genPermutations(HashSet<String> uniquePermutations,ArrayList<String> res, char[]arr,int n)
    {
        if(n==0)
        { String per=new String(arr);
            if(!uniquePermutations.contains(per)){
                uniquePermutations.add(per);
                res.add(per);
            }
            
        }
        for(int i=0;i<=n;i++)
        {
            swap(arr,i,n);
            genPermutations(uniquePermutations,res,arr,n-1);
            swap(arr,i,n);
        }
        
    }
    void swap(char arr[], int i, int j)
    {
        char t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
