// Last updated: 7/11/2026, 10:33:23 AM
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        int maxleft = nums[0];
        for(int i = k;i<n;i++){
            maxleft = Math.max(maxleft,nums[i-k]);
            ans = Math.max(ans,maxleft+nums[i]);
            
        }
        return ans;
    }
}