// Last updated: 7/13/2026, 10:30:59 AM
class Solution {
    public void sortColors(int[] nums) {
        int num = nums.length;
        for(int i = 0;i<num-1;i++){
            for(int j = 0;j<num-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp; 
                }
            }
        }
  
        
    }
}