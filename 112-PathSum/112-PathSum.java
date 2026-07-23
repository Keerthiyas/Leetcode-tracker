// Last updated: 7/23/2026, 8:57:46 AM
1
2/**
3 * Definition for a binary tree node.
4 * public class TreeNode {
5 *     int val;
6 *     TreeNode left;
7 *     TreeNode right;
8 *     TreeNode() {}
9 *     TreeNode(int val) { this.val = val; }
10 *     TreeNode(int val, TreeNode left, TreeNode right) {
11 *         this.val = val;
12 *         this.left = left;
13 *         this.right = right;
14 *     }
15 * }
16 */
17class Solution {
18    public int minDepth(TreeNode root) {
19        if(root==null)
20        {
21            return 0;
22        }
23        if(root.left==null)
24        {
25            return 1+minDepth(root.right);
26        }
27        if(root.right==null)
28        {
29            return 1+minDepth(root.left);
30        }
31        return 1+Math.min(minDepth(root.left),minDepth(root.right));
32    }
33}