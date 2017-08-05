public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
		Map<Integer, Integer> map = new HashMap();
        Stack<Integer> s = new Stack();
        for (int num : nums){
            while (!s.empty() && num > s.peek()){
                map.put(s.pop(), num);
            }
            s.push(num);
        }
        for (int i = 0; i < findNums.length; i++){
            findNums[i] = map.getOrDefault(findNums[i], -1);
        }
        return findNums;
    }
}