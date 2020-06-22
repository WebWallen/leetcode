# Give value and next
class Node(object):
    def __init__(self, val):
        self.val = val
        self.next = None

# Give head and size
class MyLinkedList(object):
    def __init__(self, val):
        self.head = None
        self.size = 0

    def get(self, index):
        # Edge cases (out of range, no head)
        if index < 0 or index >= self.size: return -1
        if self.head is None: return -1

        cur = self.head 
        # End range at index, automatically exits loop at right value
        for i in range(index):
            cur = cur.next 
        return cur.val

    def addAtHead(self, val):
        node = Node(val)
        node.next = self.head
        self.head = node
        self.size += 1

    def addAtTail(self, val):
        cur = self.head
        if cur is None:
            self.head = Node(val)
        else:
            while cur.next is not None:
                cur = cur.next
            cur.next = Node(val)
        self.size += 1

    def addAtIndex(self, index, val):
        if index < 0 or index >= self.size: return
        if index == 0: self.addAtHead(val)
        else:
            cur = self.head
            for i in range (index - 1):
                cur = cur.next
            node = Node(val)
            node.next = cur.next
            cur.next = node
            self.size += 1

    def deleteAtIndex(self, index, val):
        if index < 0 or index >= self.size: return
        
        cur = self.head
        if index == 0: self.head = cur.next

        else:
            for i in range(index):
                cur = cur.next
            cur.next = cur.next.next
        
        self.size -= 1