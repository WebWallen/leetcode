def oddEvenList(self, head):
    # Make placeholder nodes for ease of comparison 
    node1 = odd = ListNode(0)
    node2 = even = ListNode(0)

    while head:
        odd.next = head
        even.next = head.next
        odd = odd.next
        even = even.next
        head = head.next.next if even else None

    odd.next = node2.next
    return node1.next