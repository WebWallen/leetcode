let hasCycle = function(head) {
    // Initialize fast/slow pointers
    let fast = head;
    let slow = head;

    // While list is being traversed, move fast up two and slow up one
    while (fast !== null && fast.next !== null) {
        fast = fast.next.next;
        slow = slow.next;

        if (fast === slow) return true;
    }

    // Default (returns false if no node matches)
    return false;
};