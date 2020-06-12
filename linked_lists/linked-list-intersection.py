class Solution:
    def getIntersectionNode(self, headA, headB):
        if headA is None or headB is None: return None
        
        # Initialize pointers
        pa = headA
        pb = headB
        
        while pa is not pb:
            # If it hits end, switch head and continue to second traversal; otherwise, increment
            pa = headB if pa is None else pa.next
            # Switching the head makes differing linked list lengths a moot point
            pb = headA if pb is None else pb.next
            
        return pa # They either meet or both hit end = None so returning this pointer works