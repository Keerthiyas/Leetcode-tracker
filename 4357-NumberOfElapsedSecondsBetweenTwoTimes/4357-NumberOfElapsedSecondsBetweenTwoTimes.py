# Last updated: 7/12/2026, 9:05:19 PM
class Solution(object):
    def secondsBetweenTimes(self, startTime, endTime):
        """
        :type startTime: str
        :type endTime: str
        :rtype: int
        """
        return sum (int(x)*y  for x,y in zip (endTime.split(":"),[3600,60,1]))- sum (int(x)*y for x,y in zip (startTime.split(":"),[3600,60,1]))