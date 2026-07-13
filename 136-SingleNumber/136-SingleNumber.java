// Last updated: 7/13/2026, 10:29:11 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;   
        }
        return result;
    }
}
