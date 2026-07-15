// Last updated: 7/15/2026, 9:27:23 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] nums) {
3
4        // Max Subarray (Kadane)
5        int maxSum = Integer.MIN_VALUE;
6        int currSum = 0;
7
8        for(int num : nums){
9            currSum = Math.max(num, currSum + num);
10            maxSum = Math.max(maxSum, currSum);
11        }
12
13        // Min Subarray (Kadane)
14        int minSum = Integer.MAX_VALUE;
15        currSum = 0;
16
17        for(int num : nums){
18            currSum = Math.min(num, currSum + num);
19            minSum = Math.min(minSum, currSum);
20        }
21
22        // Total Sum
23        int totalSum = 0;
24        for(int num : nums){
25            totalSum += num;
26        }
27
28        int maxCircular = totalSum - minSum;
29
30        if(maxSum > 0){
31            return Math.max(maxSum, maxCircular);
32        }
33
34        return maxSum;
35    }
36}