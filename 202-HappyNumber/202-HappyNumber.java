// Last updated: 7/13/2026, 10:28:07 AM
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(true) {
            slow = squareSum(slow);            
            fast = squareSum(squareSum(fast));  
            if(slow==fast)
                break;
        } 
        return slow == 1;  
    }
    private int squareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}