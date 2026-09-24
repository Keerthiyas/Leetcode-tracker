// Last updated: 9/24/2026, 7:49:45 PM
1class Solution {
2    public List<List<Integer>> levelOrderBottom(TreeNode root) {
3        List<List<Integer>> result = new ArrayList<>();
4
5        if (root == null) {
6            return result;
7        }
8
9        Queue<TreeNode> queue = new LinkedList<>();
10        queue.add(root);
11
12        while (!queue.isEmpty()) {
13            int levelSize = queue.size();
14            List<Integer> currentLevel = new ArrayList<>(levelSize);
15
16            for (int i = 0; i < levelSize; i++) {
17                TreeNode currentNode = queue.poll();
18
19                currentLevel.add(currentNode.val);
20
21                if (currentNode.left != null) {
22                    queue.add(currentNode.left);
23                }
24
25                if (currentNode.right != null) {
26                    queue.add(currentNode.right);
27                }
28            }
29
30            result.add(0, currentLevel);
31        }
32
33        return result;
34    }
35}