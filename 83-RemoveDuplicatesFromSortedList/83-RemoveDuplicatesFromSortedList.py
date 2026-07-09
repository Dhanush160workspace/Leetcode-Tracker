# Last updated: 7/9/2026, 3:10:55 PM
# Definition for singly-linked list.
class ListNode:
    def __init__(self, val, next):
        self.val = val
        self.next = next

class Solution:
    def deleteDuplicates(self, head):
        current = head
        
        # Traverse the list
        while current and current.next:
            if current.val == current.next.val:
                current.next = current.next.next
            else:
                current = current.next
        return head