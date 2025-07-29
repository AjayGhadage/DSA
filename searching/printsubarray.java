public class printsubarray {
    public static void printSubarrays(int[] nums) {
        int n = nums.length;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        printSubarrays(nums);
    }
}
