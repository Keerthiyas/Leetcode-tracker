// Last updated: 8/2/2026, 12:59:57 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int count = 0;
4        
5        
6        if (x == y)
7            return count;
8        
9        
10        while (x > 0 || y > 0) {
11            int xBit = 0;
12            int yBit = 0;
13            
14            
15            if (x > 0) {
16                xBit = x % 2;
17                x = Math.floorDiv(x, 2);
18            }
19            
20            
21            if (y > 0) {
22                yBit = y % 2;
23                y = Math.floorDiv(y, 2);
24            }
25            
26            
27            if (xBit != yBit)
28                count++;
29        }
30        
31        
32        return count;
33    }
34}