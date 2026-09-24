// Last updated: 9/24/2026, 10:29:36 AM
1class Solution {
2public:
3    int longestOnes(vector<int>& nums, int k) {
4
5        int n = nums.size();
6        vector<int> v(2);
7        int mx = 0;
8        int left = 0;
9
10        for (int right = 0; right < n; right++) {
11            v[nums[right]]++;
12
13            while (left < n && v[0] > k) {
14                v[nums[left]]--;
15                left++;
16            }
17
18            mx = max(mx, right - left + 1);
19        }
20
21        return mx;
22    }
23};