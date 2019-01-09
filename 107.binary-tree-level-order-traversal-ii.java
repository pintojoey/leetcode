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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
	LinkedList<List<Integer>> result = new LinkedList<>();
        
        Queue<TreeNode>queue = new LinkedList<>();
        if (root==null)return result;
	queue.add(root);
        int size;
        while(queue.size()!=0){
            List<Integer>list = new ArrayList<>();
            List<TreeNode>toQueue = new ArrayList<>();
            size=queue.size();
            for (TreeNode node : queue){
               list.add(node.val);
               if (node.left!=null)
		  toQueue.add(node.left);
               if (node.right!=null)
		  toQueue.add(node.right);
            }
            queue.clear();
            queue.addAll(toQueue);
            result.addFirst(list);
        }
        return result;
    }
   
}
