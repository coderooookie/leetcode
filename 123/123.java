public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) return 0;
        int[] begin = new int[len];
        int[] end = new int[len];
        int top = prices[0];
        int ans = 0;
        for (int i = 1; i < len; i++){
            if (prices[i] < top) top = prices[i];
            ans = Integer.max(prices[i] - top, ans);
            begin[i] = ans;
        }
        top = prices[len-1];
        ans = 0;
        for (int i = len - 2; i >= 0; i--){
            if (prices[i] > top) top = prices[i];
            ans = Integer.max(top - prices[i], ans);
            end[i] = ans;
        }
        ans = 0;
        for (int i = 0; i < len-1; i++){
            if (begin[i] + end[i+1] > ans) ans = begin[i] + end[i+1];
        }
        return Integer.max(ans, begin[len-1]);
    }
}