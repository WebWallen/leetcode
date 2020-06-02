def hasCycle(head):
    # Fast/slow pointers
    fast = head
    slow = head

    # Make sure 1/2 pointers ahead aren't null (then increment)
    while fast and fast.next:
        fast = fast.next.next   
        slow = slow.next

        if fast == slow: return True 
    
    # Default (returns false if no matches occured)
    return False

