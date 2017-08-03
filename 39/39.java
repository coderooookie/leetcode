public class Solution {
   public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList();
        List<List<Integer>> anss = new ArrayList();
        Arrays.sort(candidates);
        combinationSum(candidates,target,anss,ans,0);
        return anss;
    }
	
	public static void combinationSum(int[] candidates, int target,List<List<Integer>> anss, List<Integer> ans, int begin) {
        int len = candidates.length;
        if (begin > len - 1){return;}
    	if (candidates[begin] < target){
    		List<Integer> ans2 = new ArrayList();
    		ans2.addAll(ans);
    		combinationSum(candidates,target,anss,ans2,begin+1);
    		ans.add(candidates[begin]);
    		combinationSum(candidates,target-candidates[begin],anss,ans,begin);
    	}else if (candidates[begin] == target){
        		ans.add(target);
        		anss.add(ans);
        }
    }
}