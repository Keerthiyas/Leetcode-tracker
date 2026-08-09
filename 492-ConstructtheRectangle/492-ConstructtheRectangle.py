# Last updated: 8/9/2026, 7:57:50 PM
1class Solution(object):
2    def constructRectangle(self, area):
3        import math
4        w = int(math.sqrt(area))
5        while area % w:
6            w -= 1
7        return [area // w, w]