// Last updated: 7/11/2026, 4:23:48 PM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int count = 0;
4        for( int num : nums ){
5            if( num == 0 && digit == 0){
6                count++;
7            }
8
9            while(num > 0){
10                if(num % 10 == digit){
11                    count++;
12                }
13                num = num / 10;
14            }
15        }
16        return count;
17    }
18}