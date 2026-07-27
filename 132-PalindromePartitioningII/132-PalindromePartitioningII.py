# Last updated: 7/27/2026, 9:49:50 AM
1class Solution:
2    def findMin(self, nums):
3        left, right = 0, len(nums) - 1
4
5        while left < right:
6            mid = (left + right) // 2
7
8            if nums[mid] > nums[right]:
9                left = mid + 1
10
11            elif nums[mid] < nums[right]:
12                right = mid
13
14            else:
15                right -= 1
16
17        return nums[left]