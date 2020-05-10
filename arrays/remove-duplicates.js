var removeDuplicates = function(nums) {
    // Base case to cover situations where input is null or empty array
    if (nums === null || nums.length === 0) return 0;

    // Counter
    let i = 0;

    for (let j = 0; j < nums.length; j++) {
        // Only increment i (counter) when the numbers don't match to keep track of uniques
        if (nums[i] !== nums[j]) {
            i++;
            // Reassign i to j (moves loop ahead to next comparison)
            nums[i] = nums[j]; 
        }
    }

    // Add 1 to account for zero-based indexing (returns amount of unique elements within the array)
    return i + 1;
    
};