// Last updated: 8/6/2026, 9:23:50 AM
1class Solution {
2    public long largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        long sum = 0;
5        for(int x :nums)
6            sum+=x;
7        for(int i = nums.length-1;i>=2;i--){
8            if(sum - nums[i] > nums[i]){
9                return sum;
10            }
11            sum-=nums[i];
12        }
13      return -1;  
14        
15    }
16}