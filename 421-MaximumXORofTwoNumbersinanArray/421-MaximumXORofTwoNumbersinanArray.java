// Last updated: 9/24/2026, 10:28:51 AM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        int start = 0,end = 0;
4        int n = fruits.length,maxLen = 0;
5        Map<Integer,Integer> map = new HashMap<>();
6        while(end<n)
7        {
8            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
9            while(map.size()>=3)
10            {
11                map.put(fruits[start],map.get(fruits[start])-1);
12                if(map.get(fruits[start]) == 0) map.remove(fruits[start]);
13                start++;
14            }
15            int currLen = end-start+1;
16            maxLen = Math.max(maxLen,currLen);
17            end++;
18        }
19        return maxLen;
20    }
21}