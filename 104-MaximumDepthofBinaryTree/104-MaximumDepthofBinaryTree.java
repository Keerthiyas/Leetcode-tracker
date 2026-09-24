// Last updated: 9/24/2026, 9:10:01 PM
1/**
2 * Definition for binary tree
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11public class BSTIterator {
12    
13    private Stack<TreeNode> stack;
14    public BSTIterator(TreeNode root) {
15        stack = new Stack<>();
16        TreeNode cur = root;
17        while(cur != null){
18            stack.push(cur);
19            if(cur.left != null)
20                cur = cur.left;
21            else
22                break;
23        }
24    }
25
26    /** @return whether we have a next smallest number */
27    public boolean hasNext() {
28        return !stack.isEmpty();
29    }
30
31    /** @return the next smallest number */
32    public int next() {
33        TreeNode node = stack.pop();
34        TreeNode cur = node;
35        // traversal right branch
36        if(cur.right != null){
37            cur = cur.right;
38            while(cur != null){
39                stack.push(cur);
40                if(cur.left != null)
41                    cur = cur.left;
42                else
43                    break;
44            }
45        }
46        return node.val;
47    }
48}
49
50/**
51 * Your BSTIterator will be called like this:
52 * BSTIterator i = new BSTIterator(root);
53 * while (i.hasNext()) v[f()] = i.next();
54 */