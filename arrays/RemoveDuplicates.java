class RemoveDuplicates {
    public int remove(int[] nums) {
        int length = nums.length;

        // Last element is always unique, hence -2
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] == nums[i + 1]) {
                // Move everything over one slot to the left if we have a duplicate
                for (int j = i + 1; j < length; j++) {
                    nums[j - 1] = nums[j];
                }
                // Decrement length and repeat until all duplicates are removed
                length--;
            }
        }
        return length;
    }
}
// Space Complexity is O(1) but Time Complexity is O(n^2) due to the nested loop