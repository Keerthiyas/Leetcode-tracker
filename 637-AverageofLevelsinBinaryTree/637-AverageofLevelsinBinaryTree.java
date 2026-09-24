// Last updated: 9/24/2026, 7:37:15 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16import java.util.*;
17
18class Solution {
19    public List<Double> averageOfLevels(TreeNode root) {
20
21        List<Double> result = new ArrayList<>();
22
23        if(root == null)
24            return result;
25
26        Queue<TreeNode> queue = new LinkedList<>();
27        queue.add(root);
28
29        while(!queue.isEmpty()){
30
31            int size = queue.size();
32            double sum = 0;
33
34            for(int i=0;i<size;i++){
35                TreeNode node = queue.poll();
36                sum += node.val;
37
38                if(node.left != null)
39                    queue.add(node.left);
40
41                if(node.right != null)
42                    queue.add(node.right);
43            }
44
45            result.add(sum/size);
46        }
47
48        return result;
49    }
50}