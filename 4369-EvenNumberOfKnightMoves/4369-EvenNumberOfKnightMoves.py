# Last updated: 7/21/2026, 9:55:39 AM
class Solution(object):
    def canReach(self, start, target):
        """
        :type start: List[int]
        :type target: List[int]
        :rtype: bool
        """
        start_color =(start[0] + start[1]) % 2
        target_color = (target[0] +target[1]) %2
        return start_color == target_color
        