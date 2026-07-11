// Last updated: 7/11/2026, 10:35:56 AM
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
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
        
    }
    private int min = Integer.MAX_VALUE;
    private Integer prev = null;
    private void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev!=null){
            min = Math.min(min,root.val-prev);

        }
        prev = root.val;
        inorder(root.right);
    }
}