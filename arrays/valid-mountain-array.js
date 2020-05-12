var validMountainArray = function(A) {
    let start = 0;
    let end = A.length - 1;
    
    while (start <= end) {
        if (start === end) {
            // It's a mountain if there are 2+ elements and peak isn't at the front or end
            return A.length >= 3 && start > 0 && end < A.length - 1;
        } else {
            // Going up, each successive element is bigger than previous
            if (A[start] < A[start + 1]) start++;
            // Going down, each successive element is smaller than previous
            else if (A[end - 1] > A[end]) end--;
            // If either of the above ever fail to be true, it's not a mountain
            else return false;
        }
    }
    return false;
};