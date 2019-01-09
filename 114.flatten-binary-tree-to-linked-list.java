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
    List<TreeNode>list;
    public void flatten(TreeNode root) {
        if (root==null)return;
        list = new ArrayList<>();
        postorder(root);
        TreeNode prev = null;
        for (TreeNode node: list) {
          if (prev!=null){
              prev.right=node;
              prev.left=null;
              node.left=null;
          }
          prev=node;
        }
    }
    
    public void postorder(TreeNode root){
        if (root==null)return;
        list.add(root);
        postorder(root.left);
        postorder(root.right);
    }


}
