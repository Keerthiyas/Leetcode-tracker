# Last updated: 8/2/2026, 8:05:56 AM
1class Solution:
2    def maxPairStrength(self, nums: list[int]) -> int:
3        max = 0
4        n = len(nums)
5        for i in range(n):
6            for j in range(i+1,n):
7                a = nums[i]
8                b = nums[j]
9                g =  math.gcd(a,b)
10                current = (a*b)//(g*g)
11                if current>max:
12                    max = current
13        return max
14        