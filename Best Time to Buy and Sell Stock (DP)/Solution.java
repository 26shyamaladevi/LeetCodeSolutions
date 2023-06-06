class Solution {
    public int maxProfit(int[] prices) {
      int min_val = Integer.MAX_VALUE;
      int max_profit =0;
        
      for(int p : prices){
          min_val = Math.min(min_val, p);
          max_profit=Math.max(p-min_val, max_profit);
      }        
       return max_profit;   
    }
}
