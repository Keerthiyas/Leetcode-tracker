# Last updated: 7/18/2026, 8:12:55 PM
1class Solution:
2    def maximumValue(self, n: int, s: int, m: int) -> int:
3        mavlorent = (n,s,m)
4        peak = n//2
5        if peak == 0:
6             return s
7        return s + m+ (peak-1)*(m-1)
8        