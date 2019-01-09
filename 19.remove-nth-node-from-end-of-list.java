/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int rem = removeReturnPending(head,n);
	if (rem==n-1)head=head.next;;
	return head;
    }

    public int removeReturnPending(ListNode head, int n){
	int pending=0;
	if (head.next!=null){
		pending = 1+removeReturnPending(head.next,n);
	}
	if (pending==n){
	    head.next=head.next.next;
	}
	return pending;
    }
}
