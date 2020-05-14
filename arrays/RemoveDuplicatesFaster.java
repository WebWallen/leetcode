class RemoveDuplicatesFaster {
    // Sacrificing space complexity for gains to time complexity by placing uniques in a new array to avoid nested for loops
    public int[] removeThem(int[] nums) {
        // Edge cases always come first
        if (nums == null || nums.length == 0) return nums;
        
        int uniques = 0;

        for (int i = 0; i < nums.length; i++) {
            // First element is unique, as are others not matching previous
            if (i == 0 || nums[i] != nums[i - 1]) uniques++;
        }

        // New array for uniques and their index (counted above so we knew how much memory to allocate)
        int[] result = new int[uniques];
        int position = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[position] = nums[i];
                position++;
            }
        }

        return result;
    }
}