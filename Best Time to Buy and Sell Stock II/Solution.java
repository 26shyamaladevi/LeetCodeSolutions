class Solution {
    public int maxProfit(int[] prices) {

        int i=0,j=i+1,res=0;
        int len = prices.length-1;
        while(i<len && j<=len){
            if(prices[j]-prices[i]>0)
            {
                res+=prices[j]-prices[i];
                
            }
            i=j;
            j=i+1;
        }
        return res;
    }
}
