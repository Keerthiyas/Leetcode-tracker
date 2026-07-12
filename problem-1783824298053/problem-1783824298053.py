# Last updated: 7/12/2026, 8:14:58 AM
1class Solution(object):
2    def secondsBetweenTimes(self, startTime, endTime):
3        """
4        :type startTime: str
5        :type endTime: str
6        :rtype: int
7        """
8        return sum (int(x)*y  for x,y in zip (endTime.split(":"),[3600,60,1]))- sum (int(x)*y for x,y in zip (startTime.split(":"),[3600,60,1]))