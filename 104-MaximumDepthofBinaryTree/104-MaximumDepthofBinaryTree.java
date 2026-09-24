// Last updated: 9/24/2026, 8:40:19 PM
1class Solution {
2    public TreeNode buildTree(int[] inorder, int[] postorder) {
3        // Call the recursive function with full arrays and return the result
4        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
5    }
6    
7    private TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd) {
8        // Base case
9        if (inStart > inEnd || postStart > postEnd) {
10            return null;
11        }
12        
13        // Find the root node from the last element of postorder traversal
14        int rootVal = postorder[postEnd];
15        TreeNode root = new TreeNode(rootVal);
16        
17        // Find the index of the root node in inorder traversal
18        int rootIndex = 0;
19        for (int i = inStart; i <= inEnd; i++) {
20            if (inorder[i] == rootVal) {
21                rootIndex = i;
22                break;
23            }
24        }
25        
26        // Recursively build the left and right subtrees
27        int leftSize = rootIndex - inStart;
28        int rightSize = inEnd - rootIndex;
29        root.left = buildTree(inorder, inStart, rootIndex - 1, postorder, postStart, postStart + leftSize - 1);
30        root.right = buildTree(inorder, rootIndex + 1, inEnd, postorder, postEnd - rightSize, postEnd - 1);
31        
32        return root;
33    }
34}
35