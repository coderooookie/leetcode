class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++){
            dp[i][i] = nums[i];
        }
        for (int i = 1; i < len; i++){
            for (int j = 0; j < len - i; j++){
                dp[j][j+i] = Integer.max(nums[j]-dp[j+1][j+i], nums[j+i]-dp[j][j+i-1]);
            }
        }
        return dp[0][len-1] >= 0;
    }
}
