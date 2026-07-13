// Last updated: 7/13/2026, 10:31:17 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length;
       for(int i = k-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;

       }
    int[] newNumber = new int [k+1];
    newNumber[0] = 1;
    
    return newNumber;
            
    }
    
}