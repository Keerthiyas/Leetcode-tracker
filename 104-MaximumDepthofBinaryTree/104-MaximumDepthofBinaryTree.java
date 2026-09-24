// Last updated: 9/24/2026, 8:57:59 PM
1class Solution {
2    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
3        List<Integer> ans = new ArrayList<>();
4        Map<Integer, TreeNode> parent = new HashMap<>();
5        Queue<TreeNode> queue = new LinkedList<>();
6        queue.offer(root);
7
8        while (!queue.isEmpty()) {
9            int size = queue.size();
10            for (int i = 0; i < size; i++) {
11                TreeNode top = queue.poll();
12
13                if (top.left != null) {
14                    parent.put(top.left.val, top);
15                    queue.offer(top.left);
16                }
17
18                if (top.right != null) {
19                    parent.put(top.right.val, top);
20                    queue.offer(top.right);
21                }
22            }
23        }
24
25        Map<Integer, Integer> visited = new HashMap<>();
26        queue.offer(target);
27        while (k > 0 && !queue.isEmpty()) {
28            int size = queue.size();
29
30            for (int i = 0; i < size; i++) {
31                TreeNode top = queue.poll();
32
33                visited.put(top.val, 1);
34
35                if (top.left != null && !visited.containsKey(top.left.val)) {
36                    queue.offer(top.left);
37                }
38
39                if (top.right != null && !visited.containsKey(top.right.val)) {
40                    queue.offer(top.right);
41                }
42
43                if (parent.containsKey(top.val) && !visited.containsKey(parent.get(top.val).val)) {
44                    queue.offer(parent.get(top.val));
45                }
46            }
47
48            k--;
49        }
50
51        while (!queue.isEmpty()) {
52            ans.add(queue.poll().val);
53        }
54        return ans;
55    }
56}