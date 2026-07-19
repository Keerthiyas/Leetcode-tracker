# Last updated: 7/19/2026, 7:45:49 AM
class Solution:
    def rearrangeString(self, s: str, x: str, y: str) -> str:
        x_count = s.count(x);
        y_count = s.count(y)
        ans = []
        for ch in s:
            if ch!=x  and  ch!=y:
                ans.append(ch)
        ans.extend(y*y_count)
        ans.extend(x * x_count)
        return "".join(ans)
        