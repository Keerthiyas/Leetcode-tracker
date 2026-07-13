// Last updated: 7/13/2026, 10:27:50 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) { 
                return true;
            }
        }
        return false; 
    }
    
}