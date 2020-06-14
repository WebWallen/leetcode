def removeElements(self, head: ListNode, val: int) -> ListNode:
    # Create node to make comparison easier and assign to current
    node = ListNode(0)
    node.next = head
    cur = node

    while cur.next:
        if cur.next.val == val:
            cur.next = cur.next.next

        else: 
            cur = cur.next

    # Actually returns head
    return node.next