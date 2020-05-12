var checkIfExist = function(arr) {
    
    let j = 0;
    
    // Need to use a for within a while because we must compare *all* of "i" to *each* number in j
    while (j < arr.length) {
        for (let i = 0; i < arr.length; i++) {
            // If one number = double another, exit the loop 
            if (arr[i] === 2 * arr[j]) return true;
            else continue;
        }
        // Increment j outside for loop to compare all
        j++;
    }
    
    // True never triggered, so it has to be False
    return false;
};