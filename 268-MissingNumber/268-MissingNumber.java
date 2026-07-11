// Last updated: 7/11/2026, 10:37:39 AM
class Solution {
    public int missingNumber(int[] nums) {
        int num = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<num;i++){
            if(i != nums[i]){
                return i;
            }

        }
        return num;
    }
}