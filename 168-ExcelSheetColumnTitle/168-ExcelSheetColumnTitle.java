// Last updated: 7/13/2026, 10:28:26 AM
class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while (n > 0) {
            n--;
            str.append((char)('A' + (n % 26)));
            n /= 26;
        }
        return str.reverse().toString();
    }
}