# Last updated: 9/24/2026, 7:39:41 PM
1class Solution:
2    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
3        if not root: #Base Case
4            return root
5        self.invertTree(root.left) #Call the left substree
6        self.invertTree(root.right)  #Call the right substree
7        # Swap the nodes
8        root.left, root.right = root.right, root.left
9        return root # Return the root
10        