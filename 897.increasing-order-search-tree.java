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
    TreeNode pointer;	
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);
        pointer = ans;
        inorder(root);
        return ans.right;
    }
   
    public void inorder(TreeNode node){
	if(node==null)return;
	inorder(node.left);
	node.left=null;
	pointer.right=node;
	pointer=node;

	inorder(node.right);
    }
}
