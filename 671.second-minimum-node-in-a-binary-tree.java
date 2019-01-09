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
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null)
           return -1;
        if (root.left==null && root.right==null){                      
            return -1;
        }
        else {
 
           if (root.left.val > root.val && root.right.val > root.val)
              return Math.min(root.left.val, root.right.val);
           
           if (root.left.val == root.val && root.right.val == root.val){
              int lsearch = findSecondMinimumValue(root.left);
              int rsearch = findSecondMinimumValue(root.right);
              if (lsearch ==-1 && rsearch == -1)return -1;
              else if (lsearch==-1)return rsearch;
              else if (rsearch==-1)return lsearch;
              else
                  return Math.min(lsearch, rsearch);
           }
           else if (root.left.val == root.val){
              int search = findSecondMinimumValue(root.left);

              if (search==-1)return root.right.val;
              return Math.min(search, root.right.val);    
           }
           else if (root.right.val == root.val){
              int search = findSecondMinimumValue(root.right);

              if (search==-1)return root.left.val;
              return Math.min(search,root.left.val);
           }
           return -1;
         
        }
    }

}
