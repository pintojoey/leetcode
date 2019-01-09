/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
ListNode start = null;
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null)
            return true;        
        start = head;
        return isPalinHelper(head);
    }
    
    public boolean isPalinHelper(ListNode track)
    {
        if(track==null)
            return true;
        boolean ret = isPalinHelper(track.next);
        ret &= track.val==start.val;
        start = start.next;
        return ret;
        
    }
}
