# Last updated: 8/1/2026, 12:56:31 PM
1class Solution(object):
2    def isPerfectSquare(self, num):
3        if num < 2:
4            return True
5
6        left, right = 2, num // 2
7        while left <= right:
8            mid = (left + right) // 2
9            squared = mid * mid
10            if squared == num:
11                return True
12            elif squared < num:
13                left = mid + 1
14            else:
15                right = mid - 1
16
17        return False