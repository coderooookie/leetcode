class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList<Integer>());
        if (len == 0) return list;
        addSets(list,nums,0,len);
        return list;
    }
    public static void addSets(List<List<Integer>> list, int[] nums, int begin, int end){
        if (begin >= end) return;
        int size = list.size();
        for (int i = 0; i < size; i++){
            List<Integer> tmp = new ArrayList();
            tmp.addAll(list.get(i));
            tmp.add(nums[begin]);
            list.add(tmp);
        }
        addSets(list,nums,begin+1,end);
    }
}