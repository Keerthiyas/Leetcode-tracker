// Last updated: 9/24/2026, 8:56:23 PM
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
26        Node curr = root;
27
28        while (curr != null) {
29            // Dummy node helps build the next level
30            Node dummy = new Node(0);
31            Node tail = dummy;
32
33            // Traverse current level using next pointers
34            while (curr != null) {
35
36                // Add left child to next level
37                if (curr.left != null) {
38                    tail.next = curr.left;
39                    tail = tail.next;
40                }
41
42                // Add right child to next level
43                if (curr.right != null) {
44                    tail.next = curr.right;
45                    tail = tail.next;
46                }
47
48                curr = curr.next;
49            }
50
51            // Move to the first node of the next level
52            curr = dummy.next;
53        }
54
55        return root;
56    }
57}