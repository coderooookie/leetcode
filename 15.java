public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        if (len < 3){return new ArrayList<List<Integer>>();}
        Arrays.sort(nums);
        List ansList = new ArrayList<List<Integer>>();
        for (int i = 0; i < len - 2; i++){
        	if (i > 0 && nums[i] == nums[i-1]) continue;
        	int begin = i + 1;
        	int end = len - 1;
        	while (begin < end){
        		if (nums[begin] + nums[end] < -nums[i]){begin++;}
        		else if (nums[begin] + nums[end] > -nums[i]){end--;}
        		else{
        			ansList.add(Arrays.asList(nums[i],nums[begin],nums[end]));
        			while (begin < len-1 && nums[begin] == nums[begin+1]) begin++;
        			while (end > 0 && nums[end] == nums[end-1]) end--;
        			begin++;
        			end--;
        		}
        	}
        }
        return ansList;
    }
}
