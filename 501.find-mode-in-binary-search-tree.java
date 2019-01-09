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
    List<Integer>result;
    int maxCount =0;
    Integer current = null;
    Integer count = 0; 
    public int[] findMode(TreeNode root) {
        result = new ArrayList<>();
        if (root==null)
           return new int[0];
        explore(root);
        int []resArray = new int[result.size()];
        for (int i=0;i<result.size();i++){
          resArray[i]=result.get(i);
        }
        return resArray;
    }

    public void explore(TreeNode root){
       if (root==null)return;
       explore(root.left);
       if (current!=null && root.val==current){
          count++;
       }
       else {
          current = root.val;
          count = 1;
       }
       if (count>maxCount){
          maxCount=count;
          result.clear();
       }
       if (count==maxCount && !result.contains(root.val)){
             result.add(root.val);
       }
       explore(root.right);
    }
}
