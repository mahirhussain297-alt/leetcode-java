
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        // Find the maximum element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            // Calculate the sum after division
            for (int i = 0; i < nums.length; i++) {
                sum += (nums[i] + mid - 1) / mid;
            }

            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
