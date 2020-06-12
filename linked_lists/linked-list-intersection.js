function getIntersectionNode(headA, headB) {
    // Base case
    if (headA === null || headB === null) return null;

    // Intialize pointers
    pa = headA;
    pb = headB;

    while (pa !== pb) {
        if (pa === null) pa = headB;
        else if (pb === null) pb = headA;
        else {
            pa = pa.next
            pb = pb.next
        }
    }

    return pa;
}