/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        while(head.next!=null){
             ListNode temp = head.next;
             head.next=null;
             temp.next=head;
	     head=temp;
             
        }
        return head;
    }
}
