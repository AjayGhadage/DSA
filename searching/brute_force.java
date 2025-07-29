public class brute_force { 
    public static void printSubarrays(int[] nums) {
        int n = nums.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    currentSum += nums[k];
                    System.out.print(nums[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                System.out.println("]");
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printSubarrays(nums);
    }
}
