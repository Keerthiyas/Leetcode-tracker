// Last updated: 9/24/2026, 8:48:53 PM
1class Solution {
2    public void flatten(TreeNode root) {
3        TreeNode curr = root;
4
5        while (curr != null) {
6
7            // If there is no left subtree,
8            // the node is already in the correct position.
9            if (curr.left == null) {
10                curr = curr.right;
11                continue;
12            }
13
14            // Find the rightmost node of the left subtree
15            TreeNode predecessor = curr.left;
16
17            while (predecessor.right != null) {
18                predecessor = predecessor.right;
19            }
20
21            // Connect the rightmost node of the left subtree
22            // to the original right subtree.
23            predecessor.right = curr.right;
24
25            // Move the left subtree to the right
26            curr.right = curr.left;
27
28            // Left pointer must always be null
29            curr.left = null;
30
31            // Move to the next node
32            curr = curr.right;
33        }
34    }
35}