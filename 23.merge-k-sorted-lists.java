/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Node>queue=new PriorityQueue<>();
	ListNode head=null;
	ListNode next=null;
	while(true){
	    for(int i=0;i<lists.length;i++){
	       ListNode node = lists[i];
	       if (node!=null){
	           queue.add(new Node(node));
	           lists[i]=node.next;
	       }
	    }
	    if(queue.size()==0)return head;
	    if (head==null){
		head = queue.poll().node;
		next=head;
	    }
	    else{
		next.next=queue.poll().node;
		next=next.next;
	    }
        }
    }
    class Node implements Comparable{ 
	int val;
	ListNode node;
	public Node(ListNode node){
	    this.val=node.val;
	    this.node=node;
	}
	@Override
	public int compareTo(Object oth) {
	    Node other=(Node)oth;
            return (this.val < other.val ) ? -1: (this.val > other.val) ? 1:0 ;
        }

    }
}
