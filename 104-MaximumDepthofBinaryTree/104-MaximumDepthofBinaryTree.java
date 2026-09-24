// Last updated: 9/24/2026, 8:55:17 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root == null) return null;
27        Queue<Node> q = new LinkedList<>();
28        q.offer(root);
29        while(!q.isEmpty()) {
30            Node rightNode = null;
31            for(int i = q.size(); i > 0; i--) {
32                Node cur = q.poll();
33                cur.next = rightNode;
34                rightNode = cur;
35                if(cur.right != null) {
36                    q.offer(cur.right);
37                    q.offer(cur.left);
38                }
39            }
40        }
41        return root;        
42    }
43}