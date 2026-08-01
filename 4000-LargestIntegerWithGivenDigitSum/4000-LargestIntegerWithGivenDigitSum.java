// Last updated: 8/1/2026, 12:43:47 PM
1class Solution {
2    private static final int[] pow = {0, 1, 10, 100, 1000, 10000, 100000};
3    public int largestInteger(int n, int s) {
4        if (s > n * 9) return -1;
5        int q = s / 9;
6        return pow[n + 1] - pow[n - q + 1] + (s % 9) * pow[n - q];
7    }
8}