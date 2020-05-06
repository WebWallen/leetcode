int[] squareNumbers = new int[10];

// Go through array indexes 0 to 9
for (int i = 0; i < 10; i++) {
    // Put the squares of 1-10 inside
    int square = (i + 1) * (i + 1);
    squareNumbers[i] = square;
    // Print each number as we go
    System.out.println(square);
}

// More elegant option (for each) to be used when you don't need an index
for (int square : squareNumbers) {
    // For each square inside squareNumbers, print the value
    System.out.println(square);
}