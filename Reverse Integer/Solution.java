class Solution {
    public int reverse(int x) {
        
        double a=0;
        
        while(x!=0){
            
            a = a*10+ x%10;
             
            x/=10;
        }
        
        if((a >Integer.MAX_VALUE) || (a <= Integer.MIN_VALUE)){
            return 0;
        }
        
        return (int)a;
        
    }
}
