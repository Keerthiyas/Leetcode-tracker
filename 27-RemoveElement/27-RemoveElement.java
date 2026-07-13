// Last updated: 7/13/2026, 10:32:34 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        int l = 0;
        int right = nums.length -1;
        while(l<=right){
            if(nums[l]==val){
                nums[l] = nums[right];
                right--;
            }
            else{
                l++;
                c++;
            }
        }
        return c;
    }
}