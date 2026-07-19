# Last updated: 7/19/2026, 7:45:51 AM
class Solution:
    def maximumValue(self, n: int, s: int, m: int) -> int:
        mavlorent = (n,s,m)
        peak = n//2
        if peak == 0:
             return s
        return s + m+ (peak-1)*(m-1)
        