// Last updated: 7/11/2026, 10:36:05 AM
class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0 ;
        
        int suffix = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            suffix += nums[i] ;
        }
        int i = 0 ;
        

        for(i = 0 ; i < nums.length ; i++){
            suffix -= nums[i] ;
            if(prefix == suffix){
                return i ;
            }
            prefix += nums[i] ;
            // suffix -= nums
        }
        return -1 ;
    }
}