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
    public String tree2str(TreeNode t) {
           String s = "";
           if (t!=null){
               s+=t.val;
               if (t.left!=null){
                   s+=( "("+tree2str(t.left)+")");
               }
               else if (t.right!=null){
                   s+="()";
               }
               if (t.right!=null){ 
                   s+=( "("+tree2str(t.right)+")");
               }
           }
           return s;           
    }
}
