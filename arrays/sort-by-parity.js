function sortArrayByParity (A) {
    let evens = [];
    let odds = [];
    
    for (num of A) {
        if (num % 2 == 0) evens.push(num);
        else odds.push(num);
    }
    
    return evens.concat(odds);
};