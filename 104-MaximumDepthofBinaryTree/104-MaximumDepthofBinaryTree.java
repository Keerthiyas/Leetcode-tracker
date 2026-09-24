// Last updated: 9/24/2026, 9:01:57 PM
1public class Solution {
2
3    int sum = 0;
4    
5    public TreeNode convertBST(TreeNode root) {
6        convert(root);
7        return root;
8    }
9    
10    public void convert(TreeNode cur) {
11        if (cur == null) return;
12        convert(cur.right);
13        cur.val += sum;
14        sum = cur.val;
15        convert(cur.left);
16    }
17    
18}