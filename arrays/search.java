// Searching is a constant time operation when we know the index it may be located at: O(1)
// Otherwise (most of the time), it is a linear O(n) operation as we have to check every element
public class search {
    // Java always starts with a CLASS that contains "public" or "private" functions
    public static void main(String args[]) {
        // Declare new array of six elements
        int[] array = new int[6];
        // Track the length
        int length = 0;
        // Fill the six positions with index value
        for (int i = 0; i < 6; i++) {
            array[length++] = i;
        }
        // Find out if the array contains a certain number
        System.out.println("Does it contain 4? - " + search.linearSearch(array, length, 4));
        System.out.println("Does it contain 30? - " + search.linearSearch(array, length, 30));

    }

    // Notice how this function is being called in the one above -- length is required since that is how array elements are defined
    public static boolean linearSearch(int[] array, int length, int element) {
        // Handle edge case of empty/null array
        if (array == null || length == 0) return false;

        // Start linear search at index 1
        for (int i = 0; i < length; i++) {
            if (array[i] == element) return true;
        }

        // Didn't find it
        return false;
    }
}

// Note: binary searches are good when lots of searches will be done; otherwise, linear works just fine