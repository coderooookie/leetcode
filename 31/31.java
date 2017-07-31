public class Solution {
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <2){return;}
        int len = nums.length;
        if (!bNextPermutation(nums,0,len)){Arrays.sort(nums);}
        return;
    }

    public boolean bNextPermutation(int[] nums, int from, int to){
        int len = to - from;
        if (len == 2){
            if (nums[from] < nums[1+from]){
                int tmp = nums[from];
                nums[from] = nums[1+from];
                nums[1+from] = tmp;
                return true;
            } else{return false;}
        }else{
            boolean flag = bNextPermutation(nums,from+1,to);
            if (flag) {return true;}
            else{
                for (int i = to-1; i > from; i--){
                    if (nums[i] > nums[from]){
                        int tmp = nums[i];
                        nums[i] = nums[from];
                        nums[from] = tmp;
                        Arrays.sort(nums,from+1,to);
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
