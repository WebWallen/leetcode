class Node:
    def __init__(self, val):
        self.val = val
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.size = 0

    # Get value of the "nth" node according to the index
    def get(self, index):
        # Base/exit cases
        if index < 0 or index >= self.size: return -1
        if self.head is None: return -1
        
        # Set current node to head
        cur = self.head
        
        # Stop loop at provided index then return its value
        for i in range(index):
            cur = cur.next

        return cur.val