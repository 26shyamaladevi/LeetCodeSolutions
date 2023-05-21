class Solution {
    public int climbStairs(int n) {
        int[] count_table;
        count_table = new int[n+1];
        count_table[0]=1;
        count_table[1]=1;
        for(int i=2;i<=n;i++)
        {
            count_table[i]=count_table[i-1]+count_table[i-2];
    
        }
        return count_table[n];
        }
}
