class Solution {
    public int search(int[] nums, int target) {
       int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            // STEP 4: Check if LEFT side is sorted
            if (nums[low] <= nums[mid]) {

                // STEP 5: Target is in left side
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // STEP 6: Otherwise RIGHT side is sorted
            else {

                // STEP 7: Target is in right side
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

        