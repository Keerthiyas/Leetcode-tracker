// Last updated: 7/13/2026, 10:32:38 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int slow = 0;
        for(int fast = 1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow] = nums[fast];
            }
            
        }
        return slow+1;

    }
}