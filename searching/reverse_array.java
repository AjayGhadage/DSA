public class reverse_array {
    public static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            // Move towards the middle
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverseArray(nums);
        System.out.print("Reversed array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
