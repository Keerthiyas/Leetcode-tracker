# Last updated: 7/19/2026, 8:34:06 AM
1# Definition for a binary tree node.
2# class TreeNode(object):
3#     def __init__(self, val=0, left=None, right=None):
4#         self.val = val
5#         self.left = left
6#         self.right = right
7class Solution(object):
8    def countDominantNodes(self, root):
9        """
10        :type root: Optional[TreeNode]
11        :rtype: int
12        """
13        norlavetic = root 
14        self.count = 0
15        def dfs (node):
16            if not node:
17                return float ('-inf')
18
19            left_max = dfs (node.left)
20            right_max = dfs(node.right)
21            subtree_max = max(node.val,left_max,right_max)
22
23            if node.val == subtree_max:
24                self.count+=1
25
26            return subtree_max
27
28        dfs(norlavetic)
29        return self.count