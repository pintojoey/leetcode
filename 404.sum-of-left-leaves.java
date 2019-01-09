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
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null)return 0;
        else {
             int sum = 0;
             if (root.left!=null){
                  if(root.left.left==null&&root.left.right==null){
                        sum+=root.left.val;
                  }
                  sum+=(sumOfLeftLeaves(root.left));

             }
             if (root.right!=null)sum+=sumOfLeftLeaves(root.right);
             return sum;
        }
    }
}
