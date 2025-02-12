    String removeDuplicates(String s) {
        
        Set<Character>mp= new LinkedHashSet<>();
        
        for(char c: s.toCharArray())
        {
            mp.add(c);
        }
        StringBuilder sb= new StringBuilder();
        for(Character ch:mp)
        {
            sb.append(ch);
        }
        
        return sb.toString();
        
    }
