// Typical node class definition in Java
public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
    // Head node is often used to represent entire list
}

// Visiting a node by its index takes O(N) time with N as list length

/*
1. Initialize a new node cur with the given value
2. Link the "next" field of cur to prev's next node
3. Link the "next" field of prev to cur.
Unlike arrays, we don't need to move everything, so insertioin takes O(1) time
*/

/*
1. Deleting a node requires us to find "prev" of deleted
2. Then we change prev's next to current's next, effectively removing referejnce
In this scenario, we must traverse O(N) length of list and have O(1) space complexity
*/



