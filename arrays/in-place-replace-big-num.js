// Why does LeetCode still use var? It's so bizarre...

var replaceElements = function(arr) {
    // We want last element to be -1, so start with that value
    let max = -1;
    let cur;
    
    for (let i = arr.length -1; i >= 0; i--) {
        // Set current first since that is what's decrementing
        cur = arr[i];
        // First "max" is predefined, so assign it to last index
        arr[i] = max;
        // Same element fills each slot until a bigger num appears
        if (cur > max) max = cur;
    }
    
    return arr;
};