// Last updated: 7/21/2026, 9:55:16 AM
1class Solution {
2    public int[][] modifiedMatrix(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int col[] = new int [n];
6        for (int j = 0;j<n;j++){
7            int max = Integer.MIN_VALUE;
8            for(int i = 0;i<m;i++){
9                if(matrix[i][j]>max){
10                    max = matrix[i][j];
11                }
12            }
13            col[j] = max;
14        }
15
16        for(int i= 0;i<m;i++){
17            for(int j = 0;j<n;j++){
18                if(matrix[i][j] == -1){
19                    matrix [i][j] = col[j];
20                }
21            }
22        }
23        return matrix;
24        
25    }
26}