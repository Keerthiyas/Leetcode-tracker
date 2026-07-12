// Last updated: 7/12/2026, 9:12:21 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
4            return 0;
5
6        int maxArea = 0;
7        int cols = matrix[0].length;
8        int[] heights = new int[cols];
9
10        for (char[] row : matrix) {
11            for (int i = 0; i < cols; i++) {
12                // Update heights: increment if '1', reset if '0'
13                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
14            }
15            maxArea = Math.max(maxArea, largestRectangleArea(heights));
16        }
17
18        return maxArea;
19    }
20
21    public int largestRectangleArea(int[] heights) {
22        int n = heights.length;
23        int[] left = new int[n];
24        int[] right = new int[n];
25        Stack<Integer> stack = new Stack<>();
26
27        // Nearest Smaller to Left
28        for (int i = 0; i < n; i++) {
29            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
30                stack.pop();
31            }
32            left[i] = (stack.isEmpty()) ? -1 : stack.peek();
33            stack.push(i);
34        }
35
36        stack.clear(); // Reuse stack
37
38        // Nearest Smaller to Right
39        for (int i = n - 1; i >= 0; i--) {
40            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
41                stack.pop();
42            }
43            right[i] = (stack.isEmpty()) ? n : stack.peek();
44            stack.push(i);
45        }
46
47        // Compute max area
48        int maxArea = 0;
49        for (int i = 0; i < n; i++) {
50            int width = right[i] - left[i] - 1;
51            maxArea = Math.max(maxArea, heights[i] * width);
52        }
53
54        return maxArea;
55    }
56}