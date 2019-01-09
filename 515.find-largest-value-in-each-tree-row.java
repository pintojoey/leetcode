/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null)queue.add(root);
        while(!queue.isEmpty()){
            Queue<TreeNode> next = new LinkedList<>();
            int max = Integer.MIN_VALUE;
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                max = Math.max(node.val, max);
                if (node.left!=null)next.add(node.left);
                if (node.right!=null)next.add(node.right);
            }
            queue=next;
	    result.add(max);            
        } 
        return result;
    }
}
