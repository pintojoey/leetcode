/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	if (headA==null || headB==null)return null;
       ListNode aLast = null;
       ListNode bLast = null;

	ListNode a = headA;
	ListNode b = headB;
	while(aLast==null || bLast==null|| aLast==bLast){
		if(a==b)return a;
		if (a.next==null){
			if(aLast==null)
				aLast=a;a=headB;
		}
		else a=a.next;
		if (b.next==null){if(bLast==null)bLast=b;b=headA;}
		else b=b.next;
		
	}
	return null;
    }
}
