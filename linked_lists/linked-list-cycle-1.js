let hasCycle = function(head) {
    // Initialize fast/slow pointers
    let fast = head;
    let slow = head;

    // While list is being traversed, move fast up two positions and slow up one position (if they match, return true)
    while (fast !== null && fast.next !== null) {
        fast = fast.next.next;
        slow = slow.next;

        if (fast === slow) return true;
    }

    return false;
};