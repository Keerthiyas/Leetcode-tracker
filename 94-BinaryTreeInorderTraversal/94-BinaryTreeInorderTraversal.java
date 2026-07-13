// Last updated: 7/13/2026, 10:30:14 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        pre(root, res);
        return res;
        
    }
     private void pre(TreeNode root, List<Integer> res) {
        if (root == null)
            return;

          
        pre(root.left, res); 
        res.add(root.val);  
        pre(root.right, res);
    }
}