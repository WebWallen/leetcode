const heightChecker = heights => {
    // First, clone an array with the heights sorted in order
    let sortedHeights = [...heights].sort((a,b) => a - b);
    
    // Second, compare sorted to original and increment on mismatch
    let count = 0;
    
    for (let i = 0; i < heights.length; i++) {
        if (heights[i] !== sortedHeights[i]) count++
    }
    
    // Note: this is necessary because it wants you to "move" elements in one step (can't do in a normal loop)
    return count
};