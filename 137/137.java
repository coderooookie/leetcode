class Solution {
    public int singleNumber(int[] nums) {
        int[] count = new int[32];
        for (int num:nums){
            for (int i = 0; i < 32; i++){
                if ((num & (1 << i)) != 0) count[i]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 32; i++){
            if (count[i] % 3 != 0){
                ans |= (1 << i);
            }
        }
        return ans;
    }
}
