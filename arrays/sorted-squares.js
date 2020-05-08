var sortedSquares = function(A) {
    let squares = [];
    
    for (num of A) {
        squares.push(num * num);
    }
    
    squares = squares.sort((a, b) => a - b);
    
    return squares;
};