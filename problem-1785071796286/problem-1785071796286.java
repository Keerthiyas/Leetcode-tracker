// Last updated: 7/26/2026, 6:46:36 PM
1class Solution {
2    public int vowelStrings(String[] words, int left, int right) {
3
4        int count = 0;
5
6        while (left <= right) {
7
8            String s = words[left];
9
10            char start = s.charAt(0);
11            char end = s.charAt(s.length() - 1);
12
13            if ((start == 'a' || start == 'e' || start == 'i' || start == 'o' || start == 'u')
14                    && (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u')) {
15                count++;
16            }
17
18            left++;
19        }
20
21        return count;
22    }
23}