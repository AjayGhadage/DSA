public class trappingrainwater {
    public static int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0; // Not enough walls to trap water
        }

        int n = height.length;
        int lm[] = new int[n];
        lm[0] = height[0];
        for (int i = 1; i < n; i++) {
            lm[i] = Math.max(lm[i - 1], height[i]);
        }   
        int rm[] = new int[n];
        rm[n - 1] = height[n - 1];      
        for (int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(rm[i + 1], height[i]);
        }
        int waterTrapped = 0;
        for (int i = 0; i < n; i++) {
            waterTrapped += Math.min(lm[i], rm[i]) - height[i];
        }   
        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(height);
        System.out.println("Water trapped: " + result);
    }
}
