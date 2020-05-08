var findMaxConsecutiveOnes = function(nums) {
    let max = 0;
    let current = 0;
    
//  Loop through each number inside the array and increment if it's a 1
    for (num of nums) {
        if (num === 1) current++;
        
        else {
            if (current > max) max = current;
            if (max >= nums.length / 2) return max;
            current = 0;
        }
    }

    return Math.max(max, current);
    
};

// Note to self: perhaps start doing these challenges in JS, Python, and/or Java for muscle memory?
// Reasoning = I figure LeetCode knows what will be coming on the code challenges that matter, so...