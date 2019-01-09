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
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> left = new Stack();
	Stack<TreeNode> right = new Stack();

	TreeNode A = root;
	while(A!=null){
	    left.push(A);
	    A=A.left;
	}
	
	A=root;
	while(A!=null){
	    right.push(A);
	    A=A.right;
	}

	while(!left.empty() && !right.empty() && right.peek()!=left.peek()){
	    if(left.peek().val + right.peek().val == k)
	        return true;
	    
	    if (left.peek().val + right.peek().val < k){
		TreeNode temp = left.pop();
		if (temp.right!=null){
		    temp= temp.right;
		    while(temp!=null){
			left.push(temp);
			temp=temp.left;
		    }
	        }
	    }
	    else {
		TreeNode temp =right.pop();
		if (temp.left!=null){
		   temp = temp.left;
		   while(temp!=null){
			right.push(temp);
			temp=temp.right;
		   }
		}
	    }
	}
	return false;
    }
}
