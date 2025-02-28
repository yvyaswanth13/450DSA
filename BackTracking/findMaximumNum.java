public static String findMax(String s, int k)
    {
        if(k==0)
        return s;
        String ans=s;
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)<s.charAt(j))
                {
                    s=swap(i,j,s);
                    String backTrack=findMax(s,k-1);
                    
                    if(backTrack.compareTo(ans)>0){
                        ans=backTrack;
                    }
                    
                    s=swap(i,j,s);
                }
            }
        }
        return ans;
    }
    static String swap(int i,int j, String s)
    {
        char arr[]= s.toCharArray();
        
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
        return new String(arr);
    }
}
