# Last updated: 7/18/2026, 8:06:00 PM
1class Solution:
2    def rearrangeString(self, s: str, x: str, y: str) -> str:
3        x_count = s.count(x);
4        y_count = s.count(y)
5        ans = []
6        for ch in s:
7            if ch!=x  and  ch!=y:
8                ans.append(ch)
9        ans.extend(y*y_count)
10        ans.extend(x * x_count)
11        return "".join(ans)
12        