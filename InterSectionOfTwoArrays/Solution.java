class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        //sortArrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        //pointers for nums1 & nums2
        int i=0, j=0;
        
        List<Integer> resultList = new ArrayList<>();
        
        for(int k = 0; (i<nums1.length && j<nums2.length); k++) {
            if(nums1[i]==nums2[j]) {
                resultList.add(nums1[i]);
                i++;
                j++;
            }
            
            else if(nums1[i]<nums2[j]){
                i++;
            }
            
            else {
                j++;
            }
            
        }
            
        return resultList.stream()
               .mapToInt(Integer::intValue)
                .toArray();
        
        
    }
}
