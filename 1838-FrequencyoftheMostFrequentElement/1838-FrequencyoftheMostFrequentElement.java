// Last updated: 9/24/2026, 9:14:13 AM
1class Solution { // 14 ms, faster than 55.67%
2    public int kthSmallest(int[][] matrix, int k) {
3        int m = matrix.length, n = matrix[0].length; // For general, the matrix need not be a square
4        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
5        for (int r = 0; r < m; ++r) {
6            for (int c = 0; c < n; ++c) {
7                maxHeap.offer(matrix[r][c]);
8                if (maxHeap.size() > k) maxHeap.poll();
9            }
10        }
11        return maxHeap.poll();
12    }
13}