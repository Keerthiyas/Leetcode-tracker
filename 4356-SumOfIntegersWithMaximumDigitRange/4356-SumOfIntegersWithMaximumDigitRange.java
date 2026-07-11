// Last updated: 7/11/2026, 10:33:27 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxrange = -1;
        int sum = 0;
        for(int num :nums){
            int temp = num;
            int max =0,min =9;
            while(temp>0){
                int digit = temp %10;
                if(digit>max)
                    max = digit;
                if(digit <min)
                    min = digit;
                temp/=10;
            }
            int range = max-min;
            if(range>maxrange){
                maxrange = range;
            }
            
        }
        for(int num :nums){
            int temp = num;
            int max = 0;
            int min = 9;
            while(temp >0){
                int digit = temp %10;
                if(digit>max) max = digit;
                if(digit<min) min = digit;
                temp/=10;
            }
            if(max - min == maxrange){
                sum+=num;
            }
        }
        return sum;
        
        
    }
}