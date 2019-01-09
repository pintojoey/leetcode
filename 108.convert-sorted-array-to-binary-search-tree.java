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
    public TreeNode sortedArrayToBST(int[] nums) {
        return addToTree(0,nums.length-1,nums);
    }
  
    public TreeNode addToTree(int start, int end, int[]nums){
          if(end<start ||start<0||end<0||start>=nums.length||end>=nums.length)return null;
          int mid = (start+end)/2;
          TreeNode node =new TreeNode(nums[mid]);
          node.left = addToTree(start,mid-1,nums);
          node.right = addToTree(mid+1,end,nums);
          return node;
    }
}
