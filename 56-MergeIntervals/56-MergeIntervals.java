// Last updated: 7/15/2026, 9:29:07 PM
1class Solution {
2    public boolean isPalindrome(String s, int left, int right) {
3        while (left < right) {
4            if (s.charAt(left) != s.charAt(right)) return false;
5            left++;
6            right--;
7        }
8        return true;
9    }
10
11    public boolean validPalindrome(String s) {
12        int left = 0, right = s.length() - 1;
13
14        while (left < right) {
15            if (s.charAt(left) != s.charAt(right)) {
16                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
17            }
18            left++;
19            right--;
20        }
21
22        return true;
23    }
24}