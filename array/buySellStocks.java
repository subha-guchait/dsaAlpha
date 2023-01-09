public class buySellStocks {
    public static int stocksProfit(int prices[]) {
        int bp = Integer.MAX_VALUE; // buying price
        int mp = 0; // maximum profit
        for (int i = 0; i < prices.length; i++) {
            if (bp < prices[i]) {
                int profit = prices[i] - bp;
                mp = Math.max(profit, mp);
            } else {
                bp = prices[i];
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(stocksProfit(prices));
        int prices1[] = { 7, 6, 5, 4, 3, 2 };
        System.out.println(stocksProfit(prices1));
        int prices2[] = { 5, 5, 5, 5, 5 };
        System.out.println(stocksProfit(prices2));
    }
}
