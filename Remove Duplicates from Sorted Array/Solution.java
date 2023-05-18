class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int len = nums.length;
        
        for(int i=0;i<len;i++)
        {
            int j=i+1;
            if(j<len){
                    if(nums[i]!=nums[j])
                    {

                        nums[k]=nums[i];
                        k++;

                    }
            }
            else{
                nums[k]=nums[i];
                k++;
            }
        }
        
        return k;
        
    }
}
