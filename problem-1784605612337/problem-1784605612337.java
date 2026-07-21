// Last updated: 7/21/2026, 9:16:52 AM
1
2
3class Solution {
4    public int[] findErrorNums(int[] nums) {
5        int n = nums.length;
6        int[] freq = new int[n + 1];
7
8        // Count frequency
9        for (int num : nums) {
10            freq[num]++;
11        }
12
13        int duplicate = -1, missing = -1;
14
15        for (int i = 1; i <= n; i++) {
16            if (freq[i] == 2) duplicate = i;
17            if (freq[i] == 0) missing = i;
18        }
19
20        return new int[]{duplicate, missing};
21    }
22}