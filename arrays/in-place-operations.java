// Squaring even elements and putting in new array
public int[] squareEven(int[] array, int length) {
    // Check for edge cases
    if (array == null) return null;

    // Array to hold result
    int result[] = new int[length];

    // Iterate through original
    for (int i = 0; i < length; i++) {
        int element = array[i];
        if (i % 2 == 0) element *= element;
        // Odds and even both land inside result, but only even is manipulated
        result[i] = element;
    }

    return result;
}

// Correct but inefficient as it uses 0(length) extra space
public int[] squareEvenInPlace(int[] array, int length) {
    if (array == null) return null;

    for (int i = 0; i < length; i++) {
        // Notice we do nothing for the odd indexes in this case
        if (i % 2 == 0) array[i] *= array[i];
    }
}