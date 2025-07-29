class get_largest{
    public static int getLargest(int[] nums){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int largest = getLargest(nums);
        System.out.println("Largest element is: " + largest);
    }

}