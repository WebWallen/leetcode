// Declare an integer array of 6 elements
int intArray = new int[6];
int length = 0;

// Add 3 elements to the Array
for (int i = 0; i < 3; i++) {
    intArray[length] = i;
    length++;
}

// Print the index and associated value
for (int i = 0; i < intArray.length; i++) {
    System.out.println("Index " + i + " contains " + intArray[i]);
}
// 0 ---> 1 ---> 2 ---> 0 ---> 0 ---> 0

// Insert a fourth element
intArray[length] = 10;
length++;
// 0 ---> 1 ---> 2 ---> 10 ---> 0 ---> 0

// Inserting an element to front of array is a costly operation
// Must scoot every other element to the right one (O(N) Time Complexity)
for (int i = 3; i >= 0; i--) {
    intArray[i + 1] = intArray[i]; // 1-end moved to right by 1
}

// 20 ---> 0 ---> 1 ---> 2 ---> 10 ---> 0
intArray[0] = 20; // can now add 20 to first slot since it's empty

// Same reasoning and application apply to adding element anywhere but end
for (int i = 4; i >= 2; i--) {
    // Notice we are ^ adding element to index 2
    intArray[i + 1] = intArray[i]; // 2-4 moved to the right
}

// 20 ---> 0 ---> 30 ---> 1 ---> 2 ---> 10
intArray[2] = 30; // Now there's room to add 30 in position 2