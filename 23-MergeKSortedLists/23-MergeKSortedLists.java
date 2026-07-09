// Last updated: 7/9/2026, 3:11:39 PM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (!pq.isEmpty()) {
            ListNode current = pq.poll();
            tail.next = current;
            tail = tail.next;
            
            if (current.next != null) {
                pq.add(current.next);
            }
        }
        
        return dummy.next;
    }
}