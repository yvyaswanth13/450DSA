static String longestUniqSubstrin(String str)
    {
        boolean []vis= new boolean[26];
        int left=0;
        int right=0;  
        int res=0;
        int start=0;
        int end=0;
        
      while(right<str.length())
        {
            while(vis[str.charAt(right)-'a']==true)
            {
                vis[str.charAt(left)-'a']=false;
                left++;
                
            }
            vis[str.charAt(right)-'a']=true;
            end=right-left+1;
            if(end>res)
            {
                res=end;
            }
          //  res=Math.max(res,right-left+1);
            right++;
            
        }
        return str.substring(left, left + res);
    }
