// Last updated: 7/11/2026, 4:16:07 PM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        int i = num1.length() - 1, j = num2.length() - 1;
4        int carry = 0;
5        StringBuilder result = new StringBuilder();
6
7        while (i >= 0 || j >= 0 || carry != 0) {
8            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
9            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
10
11            int total = digit1 + digit2 + carry;
12            carry = total / 10;
13
14            result.append(total % 10);
15
16            i--;
17            j--;
18        }
19
20        return result.reverse().toString();
21    }
22}