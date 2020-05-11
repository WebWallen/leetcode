// Deleting from the end of array causes lead disruption (note: this is queue like behavior)
int[] intArray = new int[10];
int length = 0;

// Add six elements and increment length to fit each addition
for (int i = 0; i < 6; i++) {
    intArray[length] = i;
    length++;
}

// Deleting the last element is simple
length--;

// Confirm it's gone in the console (use length versus intArray.length)
for (int i = 0; i < length; i++) {
    System.out.println("Index " + i + " contains " + intArray[i]);
}

// Deleting from front is expensive because we have to shift every element to the left
for (int i = 1; i < length; i++) {
    intArray[i - 1] = intArray[i]; // This is a left shift
} // ^ O(N) operation where N means total elements in array

// As above, reduce length to account for removal of first slot
length--;

// Deleting from any other position is just like above but with a different index to fit
// I.e. deleting the element at index 1 starts the loop at 2
for (int i = 2; i < length; i++) {
    intArray[i - 1] = intArray[i];
}

// Once again, reduce length to fit
length--;