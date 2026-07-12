// Last updated: 7/12/2026, 9:05:28 PM
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for( int num : nums ){
            if( num == 0 && digit == 0){
                count++;
            }

            while(num > 0){
                if(num % 10 == digit){
                    count++;
                }
                num = num / 10;
            }
        }
        return count;
    }
}