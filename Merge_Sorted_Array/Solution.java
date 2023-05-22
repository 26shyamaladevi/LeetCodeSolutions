class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[]= new int[m+n];
        int i=0,j=0,k=0;
        for(k=0;i<m && j<n && k<m+n ; k++ ){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];
                i++;
                
            }
            else{
                temp[k]=nums2[j];
                j++;
            }
            
        }
         if(i<=m+n-1){
            for(int p=k;i<=m-1;p++){
                temp[p]=nums1[i];
                i++;
            }
        }
        if(j<=n-1){
            for(int p=k;j<=n-1;p++){
                temp[p]=nums2[j];
                j++;
            }
        }
       
        
        for(int p=0;p<m+n;p++){
            nums1[p]=temp[p];
        }
        
        
    }
}
