# Last updated: 7/19/2026, 8:27:29 AM
1class Solution(object):
2    def canReach(self, start, target):
3        """
4        :type start: List[int]
5        :type target: List[int]
6        :rtype: bool
7        """
8        start_color =(start[0] + start[1]) % 2
9        target_color = (target[0] +target[1]) %2
10        return start_color == target_color
11        