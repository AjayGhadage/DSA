
import java.util.Arrays;
import java.util.*;
public class linear_search {
    public static int search(int[] nums, int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
             
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int key = 3;
        int result = search(nums, key);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}


