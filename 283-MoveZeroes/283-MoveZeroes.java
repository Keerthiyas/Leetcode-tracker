// Last updated: 7/11/2026, 10:37:37 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}