// Last updated: 8/9/2026, 8:57:34 PM
1class Solution {
2    public int maxSubarrayLength(int[] nums, int k) {
3        int ans = 0;
4        HashMap<Integer, Integer> mp = new HashMap<>();
5        int l = 0;
6
7        for (int r = 0; r < nums.length; r++) {
8            mp.put(nums[r], mp.getOrDefault(nums[r], 0) + 1);
9            while (mp.get(nums[r]) > k) {
10                mp.put(nums[l], mp.get(nums[l]) - 1);
11                l++;
12            }
13            ans = Math.max(ans, r - l + 1);
14        }
15
16        return ans;
17    }
18}