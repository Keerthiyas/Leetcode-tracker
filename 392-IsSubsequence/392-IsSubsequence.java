// Last updated: 7/11/2026, 10:37:06 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // move in s when characters match
            }
            j++; // always move in t
        }

        // If all characters in s were found in order
        return i == s.length();
    }
}
