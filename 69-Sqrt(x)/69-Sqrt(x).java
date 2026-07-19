// Last updated: 7/19/2026, 7:44:28 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5
6        int i = 0;
7        int j = cols - 1;
8
9        while (i < rows && j >= 0) {
10            if (matrix[i][j] == target) {
11                return true;
12            }
13
14            if (matrix[i][j] < target) {
15                i++;
16            } else {
17                j--;
18            }
19        }
20
21        return false;
22    }
23}