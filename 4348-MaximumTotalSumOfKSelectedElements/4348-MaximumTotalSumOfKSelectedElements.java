// Last updated: 7/11/2026, 10:33:21 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum =0;
        for(int i =0;i<k;i++){
            long c = nums[n-1-i];
            long op1 = c;
            long op2 = c*mul;
            sum += Math.max(op1,op2);
          
            mul--;
            
           
            
        }
        
        return sum;
    }
}