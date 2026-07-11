// Last updated: 7/11/2026, 10:33:26 AM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int odlen =nums[ (nums.length - 1)/2];
        int c = 0;
        for(int i= 0;i<=nums.length-1;i++){
            if(nums[i] == odlen){
                ++c;
                
            }
        }
        if(c>1){
            return false;
        }
        return c==1;
    }
}