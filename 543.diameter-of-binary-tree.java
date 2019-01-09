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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        explore(root);
        return max;
    }
    
    public void explore(TreeNode root){
       if (root == null)return;
       int val = maxDepth(root.left)+maxDepth(root.right);
       max = Math.max(max,val);
       explore(root.left);
       explore(root.right);
    }
    
    public static int maxDepth(TreeNode root){
       if (root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
       
    }
}
