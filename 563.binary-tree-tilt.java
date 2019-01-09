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
    public static int sum=0;
    public int findTilt(TreeNode root) {
         sum=0;
         tilt(root);
         return sum;
    }

    public int tilt(TreeNode root){
         if (root==null)return 0;
         int left = 0, right = 0;
         left = tilt(root.left);
         right = tilt(root.right);
         sum+=(Math.abs(right-left));
         return root.val+left+right;
    }
}
