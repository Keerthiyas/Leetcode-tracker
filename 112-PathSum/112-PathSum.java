// Last updated: 7/23/2026, 9:04:49 AM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        List<List<Integer>> result = new ArrayList<>();
4        Arrays.sort(nums);
5
6        for (int i = 0; i < nums.length - 2; i++) {
7            if (i > 0 && nums[i] == nums[i-1]) continue; // skip duplicate i
8
9            int left = i + 1;
10            int right = nums.length - 1;
11            int sum = nums[i] * -1;
12
13            while (left < right) {
14                int s = nums[left] + nums[right];
15
16                if (sum == s) {
17                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
18                    left++;
19                    right--;
20
21                    while (left < right && nums[left] == nums[left-1]) left++;
22                    while (left < right && nums[right] == nums[right+1]) right--;
23                } else if (s < sum) {
24                    left++;
25                } else {
26                    right--;
27                }
28            }
29        }
30        return result;
31    }
32}