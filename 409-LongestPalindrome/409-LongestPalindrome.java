// Last updated: 7/11/2026, 10:37:05 AM
class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];   
        int count = 0;

        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }

        for (int c : freq) {
            if (c % 2 == 0)
                count += c;
            else
                count += c - 1;
        }

        if (count < s.length())
            return count + 1;

        return count;
    }
}
