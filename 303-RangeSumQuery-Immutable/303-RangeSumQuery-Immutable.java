// Last updated: 8/1/2026, 1:16:06 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3		int i = 0;
4		int j = 0;
5		int count = 0;
6		Arrays.sort(g);
7		Arrays.sort(s);
8		while (i < g.length && j < s.length) {
9			if (s[j] >= g[i]) {
10				i++;
11				j++;
12				count++;
13			}else {
14				j++;
15			}
16		}
17		return count;
18    }
19}