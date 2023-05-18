class Solution {
    public void reverseString(char[] s) {
        int len = s.length-1;
        int i=0;
        char temp;
        do
        {
            
            temp=s[len];
            s[len]=s[i];
            s[i]=temp;
            len=len-1;
            i++;
        }while(len>i);
        
        
    
            
        System.out.println(s);
        
    }
}
