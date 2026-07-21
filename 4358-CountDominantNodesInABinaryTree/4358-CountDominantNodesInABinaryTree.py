# Last updated: 7/21/2026, 9:55:36 AM
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def countDominantNodes(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        norlavetic = root 
        self.count = 0
        def dfs (node):
            if not node:
                return float ('-inf')

            left_max = dfs (node.left)
            right_max = dfs(node.right)
            subtree_max = max(node.val,left_max,right_max)

            if node.val == subtree_max:
                self.count+=1

            return subtree_max

        dfs(norlavetic)
        return self.count