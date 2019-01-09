/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node>stack=new LinkedList();
        LinkedList<Integer>result=new LinkedList<>();
        if (root!=null)stack.push(root);
        while(stack.size()!=0){
             Node current = stack.pollLast();
                result.add(current.val);
                Collections.reverse(current.children);
                for(Node node:current.children){
                    stack.add(node);
                }
        }

        return result;
    }        
}
