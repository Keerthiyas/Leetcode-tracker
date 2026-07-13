// Last updated: 7/13/2026, 10:29:58 AM
import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean flag = true;

        while(!queue.isEmpty()){

            int size = queue.size();
            List<Integer> level = new LinkedList<>();

            for(int i=0;i<size;i++){

                TreeNode node = queue.poll();

                if(flag)
                    level.add(node.val);
                else
                    level.add(0,node.val);

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);
            }

            result.add(level);

            flag = !flag;
        }

        return result;
    }
}