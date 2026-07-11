// Last updated: 7/11/2026, 10:33:57 AM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) return true;
        return num % 10 != 0;
    }
}
