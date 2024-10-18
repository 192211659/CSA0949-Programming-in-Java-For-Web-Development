public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize to the first element
        int currentSum = nums[0]; // Current subarray sum

        for (int i = 1; i < nums.length; i++) {
            // If currentSum + nums[i] is less than nums[i], start new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is larger
        }

        return maxSum;
    }
}
