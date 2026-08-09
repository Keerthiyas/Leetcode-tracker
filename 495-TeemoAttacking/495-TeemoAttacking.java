// Last updated: 8/9/2026, 7:56:57 PM
1class Solution {
2    public int findPoisonedDuration(int[] timeSeries, int duration) {
3        int totalTime = 0;
4        int n = timeSeries.length;
5        for (int i = 0; i + 1 < n; i++) {
6            if (timeSeries[i] == timeSeries[i + 1]) continue;
7            int poisonedEnd = timeSeries[i] + duration - 1;
8            if (poisonedEnd >= timeSeries[i + 1]) {
9                poisonedEnd = timeSeries[i + 1] - 1;
10            }
11            totalTime += poisonedEnd - timeSeries[i] + 1;
12        }
13        totalTime += duration;
14        return totalTime;
15    }
16}