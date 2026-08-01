# Last updated: 8/1/2026, 8:26:15 PM
1class Solution:
2    def countValidPrefixes(self, s: str) -> int:
3        count_0=0
4        count_1 = 0
5        valid = 0
6        for char in s:
7            if char == '0':
8                count_0+=1
9            else:
10                count_1+=1
11
12            if abs(count_0 - count_1)<=1:
13                valid +=1
14        return valid
15        