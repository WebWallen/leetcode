def removeNthFromEnd(self, head, n):
        copy = ListNode(0)
        copy.next = head
        fast = slow = copy

        for i in range(n): 
            fast = fast.next

        while fast and fast.next:
            fast = fast.next
            slow = slow.next
        
        slow.next = slow.next.next
        
        return copy.next