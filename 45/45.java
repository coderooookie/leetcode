class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int step = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < len; i++){
            if (i == len-1){return step;}
            max = Integer.max(max, i+nums[i]);
            if (i == end){
                step++;
                end = max;
            }
        }
        return step;
    }
}
