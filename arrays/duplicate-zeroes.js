var duplicateZeros = function(arr) {
    let i = 0; 
    
    while (i < arr.length - 1) {
        if (arr[i] === 0) {
            // Splice syntax: index, # to remove, element to add
            arr.splice(i + 1, 0, 0);
            // Remove the last element to keep length consistent
            arr.pop();
            // Increment index by 2 to account for i & neighbor
            i = i + 2;
        } else i++;
    }
};