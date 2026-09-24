// Last updated: 9/24/2026, 9:10:55 PM
1
2class Solution {
3    public TreeNode deleteNode(TreeNode root, int key) {
4        //search
5        if(root == null ) {
6            return null;
7        }
8        if(root.val<key){
9            root.right = deleteNode(root.right,key);
10        }
11        else if(root.val>key) {
12            root.left = deleteNode(root.left,key);
13        }
14        else{
15            //case 1: leaf node
16            if(root.left == null && root.right == null ) {
17                return null;
18            }
19            //case 2 : one child
20            if(root.left ==  null){
21                return root.right;
22            }
23            else if(root.right ==  null ) {
24                return root.left;
25            }
26            //case 3 : two children
27            TreeNode IS = findInOrderSuccessor(root.right);
28            root.val = IS.val;
29
30            
31            root.right = deleteNode(root.right,IS.val);
32        }
33        return root;
34
35    }
36    private TreeNode findInOrderSuccessor(TreeNode root){
37        while(root.left != null){
38            root = root.left;
39        }
40        return root;
41    }
42}
43