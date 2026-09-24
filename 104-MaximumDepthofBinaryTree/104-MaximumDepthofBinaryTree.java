// Last updated: 9/24/2026, 8:51:14 PM
1class Solution {
2    public int widthOfBinaryTree(TreeNode root) {
3        if (root == null) return 0;
4        
5        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<>();
6        queue.add(new Pair<>(root, 0));
7        int maxWidth = 0;
8        
9        while (!queue.isEmpty()) {
10            int levelLength = queue.size();
11            int levelStart = queue.peek().getValue();
12            int index = 0;
13            
14            for (int i = 0; i < levelLength; i++) {
15                Pair<TreeNode, Integer> pair = queue.poll();
16                TreeNode node = pair.getKey();
17                index = pair.getValue();
18                
19                if (node.left != null) {
20                    queue.add(new Pair<>(node.left, 2*index));
21                }
22                
23                if (node.right != null) {
24                    queue.add(new Pair<>(node.right, 2*index+1));
25                }
26            }
27            
28            maxWidth = Math.max(maxWidth, index - levelStart + 1);
29        }
30        
31        return maxWidth;
32    }
33}