// Last updated: 7/15/2026, 9:36:16 PM
1class Solution {
2    public int countSegments(String s) {
3        // Split the string into words using spaces as separators
4        String[] words = s.split(" ");
5        int count = 0;
6
7        // Count non-empty words
8        for (String word : words) {
9            if (!word.isEmpty()) {
10                count++;
11            }
12        }
13
14        return count;
15    }
16}