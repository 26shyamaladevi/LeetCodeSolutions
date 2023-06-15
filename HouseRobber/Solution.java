class Solution {
    public int rob(int[] nums) {
       
       //Only one house 
       if(nums.length == 1) {
           return nums[0];
       } 
     
       int dp[] = new int[nums.length];
       //cost of robing one house 
       dp[0] = nums[0];
        
       //cost of robbing first two houses
       dp[1] = Math.max(nums[0], nums[1]);
       int temp = 0;
        
       for(int i = 2; i< nums.length; i++ ) {
          //rob the current house and the amount robbed from two houses ago 
          int sum = nums[i]+dp[i-2];
          //store the maximum of robbed from current house or amount robbed until the previous house  
          dp[i] = Math.max(sum, dp[i-1]);     
       }
      
        return dp[nums.length-1];
        
    }
}
