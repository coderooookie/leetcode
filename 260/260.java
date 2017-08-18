class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        int[] ans = new int[2];
        for (int num:nums){
            xor ^= num;
        }
        xor &= ~(xor&(xor-1));
        for (int num:nums){
            if ((num & xor) == 0){
                ans[0] ^= num;
            }else{
                ans[1] ^= num;
            }
        }
        return ans;
    }
}
