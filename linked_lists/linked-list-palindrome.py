def isPalindrome(self, head):
        fast = slow = head
        
        # find middle node
        while fast and fast.next:
            fast = fast.next.next
            slow = slow.next
            
        # reverse 
        node = None
        while slow:
            nxt = slow.next
            slow.next = node
            node = slow
            slow = nxt
        
        # compare the two parts
        while node:
            if node.val != head.val:
                return False
            node = node.next
            head = head.next
        
        return True