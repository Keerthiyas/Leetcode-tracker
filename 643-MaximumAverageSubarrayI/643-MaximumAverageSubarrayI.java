// Last updated: 7/11/2026, 10:36:10 AM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) sum += nums[i];

        int max = sum;

        for (int i = k; i < nums.length; i++)
            max = Math.max(max, sum += nums[i] - nums[i - k]);

        return (double) max / k;
    }
}
