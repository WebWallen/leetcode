var findNumbers = function(nums) {
    let evens = 0;
    
    for (num of nums) {
        if (num.toString().length % 2 === 0) evens++;
    }
    
    return evens;
}