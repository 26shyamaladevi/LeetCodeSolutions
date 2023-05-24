class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        else{
        s=s.replaceAll("\\s","");
        s=s.replaceAll("[\\W]|_","").toLowerCase();
        
        int len = s.length(),i=0;
        while(i<len && len!=0){
            if(s.charAt(i)!=s.charAt(len-1)){
            return false;
        }
        else{
            i++;
            len--;
        }
            
        }
        
         return true;
            
        } 
                    
    }
}
