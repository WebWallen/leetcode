var merge = function(nums1, m, nums2, n) {
    let j = 0;
    
    while (j < n) {   
        
        // Start at "m" because this describes the number of *initialized* elements (i.e. replaces empty ones) 
        for (let i = m; i < nums1.length; i++) {
            // Replace 1 element at the current empty index with the initialized element in second array
            nums1.splice(i, 1, nums2[j]);
            j++;
        }
    }
    
    // Wants them to be sorted (but also no return desired) thus the reassignment post array concatenation
    nums1 = nums1.sort((a, b) => a - b);
};