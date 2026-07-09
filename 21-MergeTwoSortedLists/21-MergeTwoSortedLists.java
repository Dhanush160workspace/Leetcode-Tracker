// Last updated: 7/9/2026, 3:11:40 PM
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prev = new ListNode(-1);
        ListNode curr = prev;
        
        // Loop runs ONLY while both lists have elements left to compare
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next; // Advance your tracking pointer
        } 
        
        // --- MOVED OUTSIDE THE LOOP ---
        // Once the loop ends, one list is completely empty. 
        // Simply attach the entire remainder of the other list.
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        
        return prev.next;
    }
}