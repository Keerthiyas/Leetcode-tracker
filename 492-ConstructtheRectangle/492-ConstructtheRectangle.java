// Last updated: 8/9/2026, 7:58:36 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxCnt = 0;
4        int curCnt = 0;
5        for(int n : nums){
6            if(n == 1)
7                curCnt++;
8            else{
9                maxCnt = Math.max(maxCnt, curCnt);
10                curCnt = 0;
11            }
12        }
13        return maxCnt>curCnt ? maxCnt : curCnt;
14    }
15}