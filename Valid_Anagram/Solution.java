import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
           return false; 
            
        }
       
        HashMap <Character, Integer> s_map = new HashMap<> ();
        HashMap <Character, Integer> t_map = new HashMap<> ();
        
        for(int index=0;index<=s.length()-1;index++){
            
            Integer count1 = s_map.get(s.charAt(index));
            Integer count2 = t_map.get(t.charAt(index));
            s_map.put(s.charAt(index),(count1==null) ? 1 : count1+1);
            t_map.put(t.charAt(index),(count2!=null) ? count2+1 : 1);
            
            
        }
    
          return s_map.equals(t_map);
            
        
    }
}
