/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
	ListNode prev= head;
	while(temp!=null&&temp.next!=null){
		temp=temp.next;
		if (prev!=null && prev.val==temp.val){
			prev.next=temp.next;
		}
		else{
			prev=temp;
		}
	}
	return head;
    }
}
