// Last updated: 7/11/2026, 10:36:54 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String part = s.substring(0, len);
                StringBuilder sb = new StringBuilder();
                
                for (int i = 0; i < n / len; i++) {
                    sb.append(part);
                }
                
                if (sb.toString().equals(s)) return true;
            }
        }
        
        return false;
    }
}
