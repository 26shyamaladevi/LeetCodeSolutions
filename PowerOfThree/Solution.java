class Solution {
    public boolean isPowerOfThree(int n) {
        double log = Math.log10(n)/Math.log10(3);
        if(n>0 && (log - (int)log== 0))
        {
        return true;
        }
        else{return false;}
        
    }
}
