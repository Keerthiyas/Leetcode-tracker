// Last updated: 7/11/2026, 10:37:20 AM
public class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOf3 = 1162261467; 
        return n > 0 && maxPowerOf3 % n == 0;
    }
}