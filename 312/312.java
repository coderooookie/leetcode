public class Solution {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        int[][] p = new int[len][len];
        for (int i = 0; i < len; i++){
            p[i][i] = nums[i] * (i == len-1 ? 1 : nums[i+1]) * (i == 0 ? 1 : nums[i-1]);
        }
        for (int i = 1; i < len; i++){
            for (int j = 0; j + i < len; j++){
                int tmp = 0;
                for (int k = j; k <= i+j; k++) {
                    tmp = (k == j ? 0 : p[j][k-1]) + (nums[k]) * (j == 0 ? 1 : nums[j-1]) * (j+i == len-1 ? 1 : nums[j+i+1]) + (k == i+j ? 0 : p[k+1][j+i]);
                    if (tmp > p[j][j+i]){p[j][j+i] = tmp;}
                }
            }
        }
        return p[0][len-1];
    }
}