// Last updated: 8/1/2026, 1:10:25 PM
1
2class Solution {
3    public int arrangeCoins(int n) {
4        long left = 1, right = n;
5        while (left <= right) {
6            long mid = left + (right - left) / 2;
7            long coins_needed = mid * (mid + 1) / 2;
8            if (coins_needed == n) return (int) mid;
9            else if (coins_needed < n) left = mid + 1;
10            else right = mid - 1;
11        }
12        return (int) right;
13    }
14}