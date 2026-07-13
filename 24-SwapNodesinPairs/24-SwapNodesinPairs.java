// Last updated: 7/13/2026, 9:46:00 AM
1class Solution {
2    public boolean isHappy(int n) {
3        int slow = n;
4        int fast = n;
5        while(true) {
6            slow = squareSum(slow);            
7            fast = squareSum(squareSum(fast));  
8            if(slow==fast)
9                break;
10        } 
11        return slow == 1;  
12    }
13    private int squareSum(int num) {
14        int sum = 0;
15        while (num > 0) {
16            int digit = num % 10;
17            sum += digit * digit;
18            num /= 10;
19        }
20        return sum;
21    }
22}