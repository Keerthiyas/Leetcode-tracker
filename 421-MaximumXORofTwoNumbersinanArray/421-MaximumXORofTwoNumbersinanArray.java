// Last updated: 9/24/2026, 10:22:42 AM
1class Solution {
2    // Trie Node definition
3    class Trie {
4        class Node {
5            int val;       // bit value at this node (0 or 1) - useful for debugging
6            Node one;      // child for bit 1
7            Node zero;     // child for bit 0
8        }
9        
10        Node root;
11        
12        Trie() {
13            root = new Node();  // root represents empty prefix
14        }
15        
16        // Insert a number into the trie (32-bit representation)
17        void add(int x) {
18            Node cur = root;
19            // Process from MSB (bit 31) to LSB (bit 0)
20            for (int i = 31; i >= 0; i--) {
21                int bit = x & (1 << i);  // Extract i-th bit
22                
23                if (bit != 0) {  // Bit is 1
24                    if (cur.one != null) {
25                        cur = cur.one;  // Follow existing 1-path
26                    } else {
27                        // Create new node for bit 1
28                        Node nn = new Node();
29                        nn.val = 1;
30                        cur.one = nn;
31                        cur = nn;
32                    }
33                } else {  // Bit is 0
34                    if (cur.zero != null) {
35                        cur = cur.zero;  // Follow existing 0-path
36                    } else {
37                        // Create new node for bit 0
38                        Node nn = new Node();
39                        nn.val = 0;
40                        cur.zero = nn;
41                        cur = nn;
42                    }
43                }
44            }
45        }
46        
47        // Find maximum XOR value with x using numbers in trie
48        int maxXor(int x) {
49            Node cur = root;
50            int ans = 0;
51            
52            // For each bit from MSB to LSB
53            for (int i = 31; i >= 0; i--) {
54                int bit = x & (1 << i);  // i-th bit of x
55                
56                if (bit != 0) {  // Current bit of x is 1
57                    // We want 0 to maximize XOR (1^0=1)
58                    if (cur.zero != null) {
59                        cur = cur.zero;      // Take 0 path
60                        ans += (1 << i);     // Add 2^i to answer (bit contributes 1)
61                    } else {
62                        cur = cur.one;       // Have to take 1 (1^1=0, no contribution)
63                    }
64                } else {  // Current bit of x is 0
65                    // We want 1 to maximize XOR (0^1=1)
66                    if (cur.one != null) {
67                        cur = cur.one;       // Take 1 path
68                        ans += (1 << i);     // Add 2^i to answer
69                    } else {
70                        cur = cur.zero;      // Have to take 0 (0^0=0)
71                    }
72                }
73            }
74            return ans;  // This is x ^ (some number in trie)
75        }
76    }
77    
78    public int findMaximumXOR(int[] nums) {
79        Trie t = new Trie();
80        
81        // Build trie with all numbers
82        for (int i : nums) {
83            t.add(i);
84        }
85        
86        int ans = 0;
87        // For each number, find maximum XOR with any number in trie
88        for (int i : nums) {
89            ans = Math.max(ans, t.maxXor(i));
90        }
91        
92        return ans;
93    }
94}