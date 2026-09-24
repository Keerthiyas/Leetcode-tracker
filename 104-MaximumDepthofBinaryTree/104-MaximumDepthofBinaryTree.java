// Last updated: 9/24/2026, 8:49:47 PM
1class Solution {
2    public int rob(TreeNode root) {
3        int[] option=helper(root);
4        return Math.max(option[0],option[1]);
5    }
6    public int[] helper(TreeNode root){
7        if(root==null) return new int[2];
8
9        int[] left=helper(root.left);
10        int[] right=helper(root.right);
11        int[] option=new int[2];
12
13        option[0]=root.val+ left[1]+right[1];
14        option[1]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
15
16        return option;
17    }
18}