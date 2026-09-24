// Last updated: 9/24/2026, 7:45:52 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int left = 0, zeros = 0, res = 0;
4        
5        for (int right = 0; right < nums.length; right++) {
6            if (nums[right] == 0) zeros++;
7            
8            while (zeros > 1) {
9                if (nums[left] == 0) zeros--;
10                left++;
11            }
12            
13            res = Math.max(res, right - left);
14        }
15        
16        return res;
17    }
18}