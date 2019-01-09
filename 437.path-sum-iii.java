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
    public static int count = 0;
    public int pathSum(TreeNode root, int sum) {
         count = 0;
         pathSum(root,sum,sum);
         return count;
    }
    public void pathSum(TreeNode root, int sum, int target) {
        if (root==null)return ;
        else if (root.val==sum){count++;pathSum(root.right,0,target);pathSum(root.left,0,target);}
        else {
             pathSum(root.left,sum-root.val,target);
             pathSum(root.right,sum-root.val,target);
             if(sum!=target && root.val==0){
                pathSum(root.right,target);
                pathSum(root.left,target);
             }
           
        }
    }
    
}
