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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int max = Integer.MIN_VALUE;
        int pos = -1;
        for (int i=0; i<nums.length; i++){
            if (nums[i]>max){
               pos = i;
               max = nums[i];
            }
        }
        List<Integer>list1 = new ArrayList<>();
        for (int j=0;j<pos;j++){
            list1.add(nums[j]);
        }
        Collections.sort(list1);
 
        List<Integer>list2 = new ArrayList<>();
        for (int j=pos+1;j<nums.length;j++){ 
            list2.add(nums[j]);
        }
        Collections.sort(list2);

        TreeNode root = new TreeNode(max);
        TreeNode prev=null;
        for (Integer val: list1){
            TreeNode node = new TreeNode(val);
            node.right=prev;
            prev=node;
        } 
        root.left=prev;

        prev=null;
        for (Integer val: list2){
            TreeNode node = new TreeNode(val); 
            node.left=prev;
            prev=node;
        }
        root.right=prev;

        return root;
    }
}
