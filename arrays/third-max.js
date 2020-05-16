// Return the "third largest" number (unless there aren't that many numbers, then second or first biggest)

function thirdMax (nums) {
    // Cut out the duplicates to remove complexity from the problem
    nums = Array.from(new Set(nums));
    
    // Assign length to variable for easy access
    let len = nums.length;
    
    // 2 or less means we want the max and 3 means we want the minimum
    if (len <= 2) return Math.max(...nums);
    
    if (len === 3) return Math.min(...nums);
    
    // All other cases require us to sort the nums and return the third largest
    nums = nums.sort((a, b) => b - a);
    
    return nums[2];
};