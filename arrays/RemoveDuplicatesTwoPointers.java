public class RemoveDuplicatesTwoPointers {
    public int remove(int[] nums) {
        // Edge case
        if (nums == null) return 0;

        // First pointer (overwrite) -- start at 1 as it's a count
        int writePointer = 1;

        // Second pointer (compare)
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                // Copy "read" to move "write" up one position
                nums[writePointer] = nums[readPointer];
                // Increment count
                writePointer++;
            }
        }

        // Returns length of array with uniques only
        return writePointer;
    }
}