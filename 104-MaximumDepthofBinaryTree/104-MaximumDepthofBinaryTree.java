// Last updated: 9/24/2026, 8:14:33 PM
1class Solution {
2    private int diameter;
3
4    public int diameterOfBinaryTree(TreeNode root) {
5        diameter = 0;
6        solve(root);
7        return diameter;
8    }
9
10    private int solve(TreeNode root) {
11        if (root == null) return 0;
12
13        int leftHeight = solve(root.left);
14        int rightHeight = solve(root.right);
15
16        diameter = Math.max(diameter, leftHeight + rightHeight);
17
18        return Math.max(leftHeight, rightHeight) + 1;
19    }
20}