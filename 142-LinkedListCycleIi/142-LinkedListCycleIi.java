// Last updated: 7/9/2026, 3:10:41 PM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                isCycle = true;
                break;
            } 
        }
        if (!isCycle){
            return null;
        }
        while(head != slow){
            head = head.next;
            slow = slow.next;
        }
        return slow;
    }
}