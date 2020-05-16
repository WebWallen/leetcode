// (It suggested doing this in place but I could not think of how -- weird spec imo as I can't imagine we'd want to manipulate existing array often)

function findDisappearedNumbers (nums) {
    // Stick the unique numbers inside a set to avoid duplicates getting in the way
    let uniques = new Set(nums);
    let missing = [];
    
    // If the set doesn't contain a number from 1 to its max value, add to the missing array
    for (let i = 1; i <= nums.length; i++) {
        if (!uniques.has(i)) missing.push(i);
    }
    
    return missing;
};