// Last updated: 7/13/2026, 10:33:25 AM
public class Solution {
    public int reverse(int num) {
        boolean isNegative = num < 0;
        
        long absNum = Math.abs((long) num); 
        
        StringBuilder sb = new StringBuilder(String.valueOf(absNum));
        sb.reverse();
        
        long reversedLong = Long.parseLong(sb.toString());
        
        if (isNegative) {
            reversedLong = -reversedLong;
        }
        
        if (reversedLong < Integer.MIN_VALUE || reversedLong > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversedLong;
    }
}
