/**
 * BuyAndSellStock_I
 */
public class BuyAndSellStock_I {

    public static void main(String[] args) {
        int[] prices = {1, 2, 5, 12, 3, 5};
        System.out.println( calculateProfit(prices) );
    }

    private static int calculateProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int price : prices) {
            buy = Math.min(price, buy);
            profit = Math.max(profit, price - buy);
        }
        return profit;
    }
}