public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[] sell = new int[len];
        int[] buy = new int[len];
        sell[0] = 0;
        buy[0] = -prices[0];
        for (int i = 1; i < len; i++){
            sell[i] = Integer.max(sell[i-1], buy[i-1]+prices[i]);
            buy[i] = Integer.max(buy[i-1], (i>1 ? sell[i-2] : 0) - prices[i]);
        }
        return Integer.max(buy[len-1],sell[len-1]);
    }
}
