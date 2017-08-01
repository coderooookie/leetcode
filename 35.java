public class Solution {
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        if (len == 0) return 0;
        for (int i = 0; i < len; i++){
            if (nums[i] >= target){return i;}
        }
        return len;
    }
}