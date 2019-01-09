/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        
        while(fast.next!=null){
           head=head.next;
           fast=fast.next;
           if (fast.next==null){break;}
           else fast=fast.next;
        }
        return head;
    }
}
