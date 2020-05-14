// Approach 1: new array
function moveZeroes(nums) {
    // Filter out the non-zeroes (left) and zeroes (right), then concat in the correct order
    let arr = nums.filter(num => num !== 0);
    let zeroes = nums.filter(num => num === 0);
    return arr.concat(zeroes);
};

// Approach 2: in place
function moveZeroesInPlace(nums) {
    // Loop through the non-zeroes first (move to left) and zeroes second (move to right)
    let pos = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] !== 0) nums[pos++] = nums[i];
    }

    for (i = pos; i < nums.length; i++) {
        nums[i] = 0;
    }

}

console.log('Array methods approach: ', moveZeroes([1, 0, 3, 0, 5, 0, 6]));
console.log('For loops in place approach: ', moveZeroes([1, 0, 3, 0, 5, 0, 6]));