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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1==null && root2==null)return true;
        if (root1==null || root2==null)return false;
        
        List<Integer>list1= new ArrayList<>();
        List<Integer>list2= new ArrayList<>();
        inOrderTraverse(root1, list1);
        inOrderTraverse(root2, list2);
        
        if (list1.size()!=list2.size())return false;
        for(int i=0;i<list1.size();i++){
           if (list1.get(i)!=list2.get(i))return false;
        }
        return true;
    }

    public void inOrderTraverse(TreeNode root,List<Integer>list){
         if (root==null)return;
         inOrderTraverse(root.left, list);
         if (root.left==null && root.right==null){
            list.add(root.val);
         }
         inOrderTraverse(root.right, list);
    }
}
