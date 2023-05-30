import java.util.*;
import java.util.Map.Entry;
class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length == 1){
            return nums[0];
        }
        
        
            int res=0;
            HashMap<Integer,Integer> singleNumber = new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                Integer count=singleNumber.get(nums[i]);
                singleNumber.put(nums[i],(count==null)?1:count+1);  
            }
             for(Entry<Integer,Integer> iterator: singleNumber.entrySet())
             {
                 if(iterator.getValue()==1){
                     res= iterator.getKey();
                     break;
                 }    
                 
             }
            
         return res;   
        
    }
}
