 public static String isValid(String s) {
    // Write your code here
    HashMap<Character,Integer> mp =new HashMap<>();
    char[]arr= s.toCharArray();
    if(arr.length==1)
    return "YES";
    
    for(char i:arr)
    {
        mp.put(i, mp.getOrDefault(i,0)+1);
        
    }
    List<Integer> res= new ArrayList<>();
    
  /*  for(Map.Entry<Character,Integer> e : mp.entrySet())
    {
        res.add(e.getValue());
    }*/
    for(int i: mp.values())
    {
        res.add(i);
    }
    Collections.sort(res);
    for(int i:res)
    System.out.println(i);
    int n=res.size();
    int first=res.get(0);
    int last=res.get(n-1);
    int second=res.get(1);
    int secondlast= res.get(n-2);
    if(first==last) return "YES";
    if(first==1 && second==last) return "YES";
    if(first==second && second==secondlast &&secondlast ==(last-1)) return "YES";
    
    return "NO";
    
    }

}
