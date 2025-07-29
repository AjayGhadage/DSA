public class buysell {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // Not enough days to buy and sell
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Calculate profit
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit: " + result);
    }
}
