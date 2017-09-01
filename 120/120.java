class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] dp = new int[len];
        int[] tmp = new int[len];
        for (int i = 0; i < len; i++){
            for (int j = 0; j <= i; j++){
                tmp[j] = (i != 0 ? Integer.min((j < i ? dp[j] : Integer.MAX_VALUE), (j > 0 ? dp[j-1] : Integer.MAX_VALUE)) : 0) + triangle.get(i).get(j);
            }
            for (int j = 0; j <= i; j++){
                dp[j] = tmp[j];
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++){
            if (dp[i] < ans) ans = dp[i];
        }
        return ans;
    }
}
