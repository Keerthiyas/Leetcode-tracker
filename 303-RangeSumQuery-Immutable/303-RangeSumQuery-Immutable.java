// Last updated: 8/1/2026, 1:01:44 PM
1class Solution {
2    public int sumOfLeftLeaves(TreeNode root) {
3        if (root == null) {
4            return 0;
5        }
6        
7        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
8        queue.offer(new Pair<>(root, false));  // (node, is_left)
9        int totalSum = 0;
10        
11        while (!queue.isEmpty()) {
12            Pair<TreeNode, Boolean> pair = queue.poll();
13            TreeNode node = pair.getKey();
14            boolean isLeft = pair.getValue();
15            
16            if (isLeft && node.left == null && node.right == null) {
17                totalSum += node.val;
18            }
19            
20            if (node.left != null) {
21                queue.offer(new Pair<>(node.left, true));
22            }
23            if (node.right != null) {
24                queue.offer(new Pair<>(node.right, false));
25            }
26        }
27        
28        return totalSum;
29    }
30}