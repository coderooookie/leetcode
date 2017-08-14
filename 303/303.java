public class NumArray {
    private int[] nums;
    private int[] dp;
    public NumArray(int[] nums) {
        this.nums = nums;
        int len = nums.length;
        dp = new int[len];
        for (int m = 0; m < len; m++){
            dp[m] = m > 0 ? dp[m-1] + nums[m] : nums[0];
        }
    }

    public int sumRange(int i, int j) {
        if (i > j){i^=j;j^=i;i^=j;}
        return i > 0 ? dp[j]-dp[i-1] : dp[j];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */