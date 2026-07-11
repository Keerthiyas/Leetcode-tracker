// Last updated: 7/11/2026, 10:35:58 AM
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
       if(val==root.val){
         return root;
       }
       else if(val>root.val){
        return searchBST(root.right,val);
       }
       else {
        return searchBST(root.left,val);
       }
       
       
    }
}