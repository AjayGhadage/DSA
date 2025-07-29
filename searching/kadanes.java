public class kadanes {
    public static int kadane(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0; // Reset current sum if it drops below zero
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        int maxSum = kadane(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
